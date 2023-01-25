package com.studentapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapi.Repository.StudentRepository;
import com.studentapi.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository srepo;

	// crud operatoins
	// get all products

	public List<Student> getallstudents() {
		return srepo.findAll();
	}

	// create product
	public void addstudents(Student student) {
		srepo.save(student);
	}

	// update product

	public void updatestudent(Student student) {
		srepo.save(student);
	}

	// delete product
	public void deletestudent(Integer id) {
		srepo.deleteById(id);
	}
}
