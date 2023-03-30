package com.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
