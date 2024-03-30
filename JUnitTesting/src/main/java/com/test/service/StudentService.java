package com.test.service;

import java.util.List;

import com.test.model.Student;

public interface StudentService {

	Student getById(String id);

	List<Student> getAll();

	void save(Student student);

	boolean deleteById(String id);

}
