package com.crud.serviceInterface;

import java.util.List;

import com.crud.model.Student;

public interface StudentInterface 
{
	// to save student
	public Student saveStudent(Student student);
	
	//to update student
	public Student updateStudent(Student studentUp);
	
	//to get all data of student
	public List<Student> findAllStudent();
	
	//to delete data of student 
	public void deleteStudent(int id);
	
}
