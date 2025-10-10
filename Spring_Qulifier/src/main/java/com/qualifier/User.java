package com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Autowired
	@Qualifier("mobielNo")
	Login l1;
	@Autowired
	@Qualifier("email")
	Login l2;
	public Login getL1() {
		return l1;
	}
	public void setL1(Login l1) {
		this.l1 = l1;
	}
	public Login getL2() {
		return l2;
	}
	public void setL2(Login l2) {
		this.l2 = l2;
	}
	
}
