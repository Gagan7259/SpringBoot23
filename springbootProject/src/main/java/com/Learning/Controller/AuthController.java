package com.Learning.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Learning.Entity.Users;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired

	// POST store the user data in db
	@PostMapping("/rigister")
	public void createUser(@RequestBody Users users) {

	}
}
