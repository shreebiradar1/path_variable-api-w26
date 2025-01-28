package org.dnyanyog.controller;

import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class AuthenticationController {

	@GetMapping("/name/{username}")
	public String name(@PathVariable String username) {
		return new StudentService().getName(username);
	}

	@GetMapping("/email/{username}")
	public String email(@PathVariable String username){
		return new StudentService().getEmail(username);
	}
	
	@GetMapping("/mobile/{username}")
	public String mobile(@PathVariable String username) {
		return new StudentService().getMobile(username);
	}
}
