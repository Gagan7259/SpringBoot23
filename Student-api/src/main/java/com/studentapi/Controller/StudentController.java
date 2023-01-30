package com.studentapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentapi.Service.StudentService;
import com.studentapi.model.Student;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController {
	@Autowired
	StudentService services;

	// crud api operations

	// Get all students information
	@GetMapping("/students")
	public List<Student> getallstudent() {
		return services.getallstudents();
	}

	// add students
	@PostMapping("/student")
	public void addstudent(@RequestBody Student student) {
		services.addstudents(student);
	}
	
	//update students
	@PutMapping ("/students")
	public void updatestudent(@RequestBody Student student) {
		services.updatestudent(student);
	}

	// delete Student
	@DeleteMapping("/student/{id}")
	public void deletestudent(@PathVariable Integer id) {
		services.deletestudent(id);
	}
}
