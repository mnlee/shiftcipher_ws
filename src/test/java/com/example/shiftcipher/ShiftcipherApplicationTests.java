package com.example.shiftcipher;


import org.json.JSONException;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ShiftcipherApplicationTests {
	
//	@BeforeClass
//	public static void runBeforeAllTestMethods() {
//		String createRequestUrl = "http://localhost:23456/api/encode";
//	
//		RestTemplate restTemplate = new RestTemplate();
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.setContentType(MediaType.APPLICATION_JSON);
//	    JSONObject personJsonObject = new JSONObject();
//	    try {
//			personJsonObject.put("shift", 1);
//			personJsonObject.put("message", "John");
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//	    
//	}

	@Test
	void contextLoads() {
	}

}
