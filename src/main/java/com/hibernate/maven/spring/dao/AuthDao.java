package com.hibernate.maven.spring.dao;

import com.hibernate.maven.spring.model.Authurization;

public interface AuthDao {
	void saveUser(Authurization authurization);
	String genToken(Authurization authurization);
}
