package com.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.dao.GymDao;
import com.gym.entities.Gym;

@Service
public class GymService {

	@Autowired
	GymDao dao;
	public String insertData(Gym g)
	{
		String msg= dao.insertData(g);
		return msg;
	}
}
