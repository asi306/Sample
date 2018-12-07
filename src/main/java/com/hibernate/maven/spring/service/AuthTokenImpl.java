package com.hibernate.maven.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.maven.spring.dao.AuthDao;
import com.hibernate.maven.spring.model.Authurization;

@Service("authService")
@Transactional
public class AuthTokenImpl implements AuthToken {
	
	
	@Autowired
	AuthDao authdao;

	@Override
	public String generateToken(Authurization authurization) {
		return authdao.genToken(authurization);

	}

	@Override
	public void saveUser(Authurization auth) {
		authdao.saveUser(auth);
	}

}
