package com.example.shiftcipher.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Response {
	
	public Response(String encodedMessage) {
		this.encodedMessage = encodedMessage;
	}

	@JsonProperty("EncodedMessage")
	private String encodedMessage;

}