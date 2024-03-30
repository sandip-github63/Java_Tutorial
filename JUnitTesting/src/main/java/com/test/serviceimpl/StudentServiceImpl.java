package com.test.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.model.Student;
import com.test.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private Map<String, Student> students = new HashMap<>();

	{
		students.put("1", new Student("1", "sandip"));
	}

	@Override
	public Student getById(String id) {
		// TODO Auto-generated method stub
		return students.get(id);

	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(students.values());
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		students.put(student.getId(), student);

	}

	@Override
	public boolean deleteById(String id) {
		return (students.remove(id) != null) ? true : false;
	}

}
