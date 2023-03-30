package com.crud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud.entities.Student;
import com.crud.repository.StudentRepository;

@SpringBootTest
class CrudApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveOneStudent() {
	Student s = new Student();
	s.setName("Brajesh");
	s.setCourse("Testing");
	s.setFee(35000);
	studentRepo.save(s);
	}
	
//	@Test
//	void deleteOneStudent() {
//		studentRepo.deleteById(null);
//	}

}
