package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class student {
	@JsonProperty("id")
	private int rollno;
	private String name;
	@JsonIgnore
	private int rank;
	public student(int rollno, String name, int rank) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.rank = rank;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

}
