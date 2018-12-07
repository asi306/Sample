package com.hibernate.maven.spring.service;

import javax.security.sasl.AuthorizeCallback;

import com.hibernate.maven.spring.model.Authurization;
import com.hibernate.maven.spring.model.Employee;

public interface AuthToken {
	String generateToken(Authurization authurization);
	
	void saveUser(Authurization auth);
}
