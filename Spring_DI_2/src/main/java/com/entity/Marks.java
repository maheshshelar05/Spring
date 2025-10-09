package com.entity;

public class Marks {

	
	int marks;
	String result;
	
	
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(int marks, String result) {
		super();
		this.marks = marks;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Marks [marks=" + marks + ", result=" + result + "]";
	}
	
	
	
}
