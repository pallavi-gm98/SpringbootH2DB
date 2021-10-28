package com.palla.springboot.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.palla.springboot.h2.model.Student;
import com.palla.springboot.h2.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	private List<Student> getAlLStudent(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	private Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentByid(id);
	}
	
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id")int id) {
		studentService.delete(id);
	}
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		studentService.save(student);
		return student ;
	}

}
