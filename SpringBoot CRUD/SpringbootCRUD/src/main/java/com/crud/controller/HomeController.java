package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.crud.model.Student;
import com.crud.serviceImplementation.StudentImpl;

@RestController
@CrossOrigin("*") //bcoz we are using postman for operation so need to use cross origin
public class HomeController
{
	@Autowired  //to create bean of implementation class
	private StudentImpl implObj;
	//TO SAVE STUDENT DATA TO DB
	@PostMapping(value = "savest")
	public Student saveStudent(@RequestBody Student stuSave)
	{
		System.out.println("Student data saved");
		implObj.saveStudent(stuSave);
		return stuSave;		
	}
	
	//TO GET ALL STUDENT DATA FROM DB
	@GetMapping(value = "allstudent")
	public List<Student> findAllStudent()
	{		
		return implObj.findAllStudent();
	}
	
	//TO UPDATE STUDENT DATA FROM DB
	@PutMapping("update")
	public Student updateStudent(@RequestBody Student stuUpdate) 
	{
		implObj.saveStudent(stuUpdate);
		return stuUpdate;
	}
	
	//TO DELETE STUDENT DATA FROM DB
	@DeleteMapping("delete")
	public String deleteStudent(@RequestParam int id)
	{
		implObj.deleteStudent(id);
		return "Successfully Deleted";
	}
}
