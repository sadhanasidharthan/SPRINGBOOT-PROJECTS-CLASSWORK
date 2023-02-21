package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Value("$(value.name)")
	private String newnameString;
	@GetMapping("/")
	public String homepage()
	{
		return "Welcome to student list";
	}
	
	@GetMapping("/list")
	public List<student> getList()
	{
		List<student>detailsList=new ArrayList<>();
		detailsList.add(new student(1,"ANTO",23));
		return detailsList;
	}
	
}
