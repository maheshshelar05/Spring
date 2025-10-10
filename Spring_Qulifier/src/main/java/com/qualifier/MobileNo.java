package com.qualifier;

import org.springframework.stereotype.Component;

@Component("mobielNo")
public class MobileNo implements Login {

	@Override
	public String login() {
		
		return "login through Mobile Number ";
	}

}
