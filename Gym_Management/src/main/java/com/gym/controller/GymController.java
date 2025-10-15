package com.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gym.entities.Gym;
import com.gym.service.GymService;

@RestController
public class GymController {

	@Autowired
	GymService service;
	@PostMapping("/add")
	public String insertData( @RequestBody Gym g)
	{
	 String msg= service.insertData(g);
	 return msg;
	}
}
