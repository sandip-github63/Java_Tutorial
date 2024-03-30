package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.test.controller.StudentController;
import com.test.model.Student;
import com.test.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

	@Mock
	private StudentService studentService;

	@InjectMocks
	private StudentController studentController;

	@Test
	public void testGetStudentById() {
		// Mocking
		String studentId = "1";
		Student mockStudent = new Student("1", "Sandip");
		mockStudent.setId(studentId);
		mockStudent.setName("Alice");

		when(studentService.getById(studentId)).thenReturn(mockStudent);

		// Test
		ResponseEntity<Student> response = studentController.getStudentById("1");

		// Assertions
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Alice", Objects.requireNonNull(response.getBody()).getName());
	}

	@Test
	public void getStudentsTest() {

		// MTA

		// Mock

		String studentId = "1";
		Student mockStudent = new Student("2", "Ajay");
		mockStudent.setId(studentId);
		mockStudent.setName("Sandip");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(mockStudent);
		when(studentService.getAll()).thenReturn(list);

		// Test

		ResponseEntity<List<Student>> response = studentController.getStudents();

		// Assertion

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Sandip", response.getBody().get(0).getName());

	}

	@Test
	public void deleteStudentTest() {
		// Mock

		String studentId = "1";

		// Test
		ResponseEntity<?> response = this.studentController.deleteStudent(studentId);

		// Assertion

		assertEquals(HttpStatus.OK, response.getStatusCode());

	}

	@BeforeEach
	public void beforeMe() {
		System.out.println("Testcase1 is running before");
	}

	@AfterEach
	public void afterMe() {
		System.out.println("Testcase1 is ended");
	}

}
