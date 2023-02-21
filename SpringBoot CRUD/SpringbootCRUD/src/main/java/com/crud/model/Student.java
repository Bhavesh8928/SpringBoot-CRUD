package com.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Table", catalog = "SpringbootCRUD_DB") //SpringbootCRUD_DB is DB name
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //for auto id generation
	private int id;
	@Column(name = "roll_no.")
	private int roll;
	private String name;
	private String address;
	
	//Generate constructor using field, using super class, getter/setter
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, int roll, String name, String address) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
