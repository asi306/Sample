package com.hibernate.maven.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
@Entity
@Table(name="USERDETAIL")
public class Authurization implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Size(min=3, max=50)
	 @Column(name = "NAME", nullable = false)
	private String userName;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
