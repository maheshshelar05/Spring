package com.gym.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Gym_Data")
public class Gym {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int m_id;
	private String m_name;
	private String m_address;
	private int m_age;
	private long m_MobileNo;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	public long getM_MobileNo() {
		return m_MobileNo;
	}

	public void setM_MobileNo(int m_MobileNo) {
		this.m_MobileNo = m_MobileNo;
	}

	public Gym(int m_id, String m_name, String m_address, int m_age, int m_MobileNo) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_address = m_address;
		this.m_age = m_age;
		this.m_MobileNo = m_MobileNo;
	}

	@Override
	public String toString() {
		return "Gym [m_id=" + m_id + ", m_name=" + m_name + ", m_address=" + m_address + ", m_age=" + m_age
				+ ", m_MobileNo=" + m_MobileNo + "]";
	}

	public Gym() {
		super();
		// TODO Auto-generated constructor stub
	}

}
