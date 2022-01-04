package com.poc.spring.jpa.springdatajpavalidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.spring.jpa.springdatajpavalidation.entity.UserInformation;
import com.poc.spring.jpa.springdatajpavalidation.repository.UserRepository;

@Service
public class UserDetailsService {
	
  @Autowired
  private UserRepository userRepository;
  
  public UserInformation saveUser(UserInformation userInformation) {
	   return userRepository.save(userInformation);
  }
  
}
