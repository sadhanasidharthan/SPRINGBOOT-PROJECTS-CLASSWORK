package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class msgcont {
	@GetMapping("/check")
	public String checkApi() throws JsonProcessingException 
	{
		
  Api response=new  Api("Hello");
	ObjectMapper obj=new ObjectMapper();
	return obj.writeValueAsString(response);
	}
}