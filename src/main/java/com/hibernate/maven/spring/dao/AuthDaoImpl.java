package com.hibernate.maven.spring.dao;

import org.springframework.stereotype.Repository;

import com.hibernate.maven.spring.model.Authurization;

@Repository("authDao")
public class AuthDaoImpl extends AbstractDao<String, Authurization> implements AuthDao{

	@Override
	public void saveUser(Authurization authurization) {
		persist(authurization);
	}

	@Override
	public String genToken (Authurization authurization) {
		Authurization auth =  getByKey(authurization.getUserName());
		if(authurization.getPassword()!= auth.getPassword()){
			return "Details Wrong";
			
		}
		return "ABC";
		
	}

}
