package com.entity;

public class Student {

	int s_id;
	String s_name;
	String s_std;
	
	Marks marks;
	
	
	
	public Student(int s_id, String s_name, String s_std, Marks marks) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_std = s_std;
		this.marks = marks;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_std=" + s_std + ", marks=" + marks + "]";
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_std() {
		return s_std;
	}
	public void setS_std(String s_std) {
		this.s_std = s_std;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int s_id, String s_name, String s_std) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_std = s_std;
	}
	
	
	
	
}
