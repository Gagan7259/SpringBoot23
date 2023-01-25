package com.studentapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
