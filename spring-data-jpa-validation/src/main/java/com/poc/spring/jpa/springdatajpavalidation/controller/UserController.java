package com.poc.spring.jpa.springdatajpavalidation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.spring.jpa.springdatajpavalidation.entity.UserInformation;
import com.poc.spring.jpa.springdatajpavalidation.service.UserDetailsService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@PostMapping(path = "/save")
	public  UserInformation createUser(@RequestBody @Valid UserInformation userInformation) {
		 return userDetailsService.saveUser(userInformation);
	}
}
