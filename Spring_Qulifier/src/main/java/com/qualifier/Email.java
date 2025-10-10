package com.qualifier;

import org.springframework.stereotype.Component;

@Component("email")
public class Email implements Login {

	@Override
	public String login() {
		
		return "login through Email  ";
	}

}
