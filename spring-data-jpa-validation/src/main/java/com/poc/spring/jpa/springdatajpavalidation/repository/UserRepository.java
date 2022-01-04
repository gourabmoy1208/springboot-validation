package com.poc.spring.jpa.springdatajpavalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.spring.jpa.springdatajpavalidation.entity.UserInformation;

public interface UserRepository extends JpaRepository<UserInformation, Integer>{

}
