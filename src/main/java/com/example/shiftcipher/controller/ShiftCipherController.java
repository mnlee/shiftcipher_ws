package com.example.shiftcipher.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.shiftcipher.exception.AllExceptions;
import com.example.shiftcipher.model.Request;
import com.example.shiftcipher.model.Response;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ShiftCipherController {

	@PostMapping(value = "/api/encode", consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	Response encodeMessage(@RequestBody Request request) {
		Response resp = new Response("");
		try {
			if (request.getShift() < 0) {
				throw new Exception();
			}
			resp.setEncodedMessage(shiftCipher(request.getMessage(), request.getShift()).toString());
			write2File(resp.getEncodedMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
			// this is a catch all exceptions return code 500 
			throw new AllExceptions();
		}

		return resp;
	}

	/**
	 * Shifting each letter a given number of letters to the right in alphabet
	 * order.
	 * 
	 * @param text
	 * @param s
	 * @return
	 */
	private StringBuffer shiftCipher(String text, int s)  throws Exception {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt((i)) == ' ') {
				result.append(' ');
			} else if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;

	}

	private void write2File(String fileContent) throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./EncodedMessage.txt"));
		writer.write(fileContent);
		writer.close();
	}

}
