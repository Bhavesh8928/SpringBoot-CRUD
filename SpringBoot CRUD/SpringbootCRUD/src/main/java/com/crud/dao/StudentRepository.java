package com.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
