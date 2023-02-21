package com.crud.serviceImplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.dao.StudentRepository;
import com.crud.model.Student;
import com.crud.serviceInterface.StudentInterface;

@Service
public class StudentImpl implements StudentInterface {
	@Autowired
	private StudentRepository repo;

	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student updateStudent(Student studentUp) {
		return repo.save(studentUp);
	}

	@Override
	public List<Student> findAllStudent() {
		return (List<Student>) repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}
}
