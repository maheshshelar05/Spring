package com.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maheshshelar05")
public class Demo {

	@GetMapping("/program")
	public String firstApi()
	{
		return "it is a set of code";
	}

	@PostMapping("/postman")
	public String secondApi()
	{
		return "it is an api testing tool";
	}
	
	@PutMapping("/maven")
	public String thirdApi()
	{
		return "it is an project developement tool";
	}
	
	@DeleteMapping("/gradle")
	public String forthApi()
	{
		return "it is an api testing tool";
	}
	@GetMapping("/vscode")
	public String sixthApi()
	{
		return "it is an api testing tool";
	}
	
}
