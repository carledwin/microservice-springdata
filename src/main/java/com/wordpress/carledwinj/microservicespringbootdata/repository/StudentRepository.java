package com.wordpress.carledwinj.microservicespringbootdata.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wordpress.carledwinj.microservicespringbootdata.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

	public List<Student> findByName(String name);
	public List<Student> findByNameLikeIgnoreCase(String name);
	
}
