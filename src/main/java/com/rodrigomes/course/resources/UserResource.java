package com.rodrigomes.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigomes.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Mario", "mario@yahoo.com", "40028922", "segredo");
		return ResponseEntity.ok().body(u);
	}
}
