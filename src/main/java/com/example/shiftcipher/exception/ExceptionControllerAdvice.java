package com.example.shiftcipher.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.shiftcipher.controller.ShiftCipherController;

import lombok.extern.slf4j.Slf4j;

/**
 * The endpoint returns 500 if unsuccessful
 * 
 * @author mnlee
 *
 */
@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AllExceptions.class)
	protected ResponseEntity<Object> handleAllExceptions(
			Exception ex,
			WebRequest request) {
		log.info("Enter ExceptionControllerAdvice");
		Map<String, Object> body = new LinkedHashMap<>();
        body.put("EncodedMessage", "");

        return handleExceptionInternal(ex, body, 
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
		
	}
	
}
