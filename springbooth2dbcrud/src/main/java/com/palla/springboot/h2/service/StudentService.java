package com.palla.springboot.h2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palla.springboot.h2.model.Student;
import com.palla.springboot.h2.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;

	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		studentRepo.findAll().forEach(student->students.add(student));
		return null;
	}

	public Student getStudentByid(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	public void save(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

}
