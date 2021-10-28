package com.palla.springboot.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.palla.springboot.h2.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
