package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Newclass {
	@GetMapping("/hello")
	public String hello()
	{
		return"MERIYA CHARLES";
	}

}
