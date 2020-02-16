package com.example.shiftcipher.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Request {
	
	
	@JsonProperty("Shift")
	private Integer shift;
	
	
	@JsonProperty("Message")
	private String message;

}
