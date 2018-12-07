package com.hibernate.maven.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.maven.spring.dao.AuthDao;
import com.hibernate.maven.spring.model.Authurization;
import com.hibernate.maven.spring.model.Employee;
import com.hibernate.maven.spring.service.AuthToken;
import com.hibernate.maven.spring.service.EmployeeService;

@RestController
@RequestMapping("/")
public class RestAppController {

	@Autowired
    EmployeeService service;
	
	@Autowired
    AuthToken token;
	
	@RequestMapping(value = "list_rest", method = RequestMethod.GET)
    public List<Employee> listEmployees() {
        List<Employee> employees = service.findAllEmployees();
        return employees;
    }
	
	@RequestMapping(value = "token", method = RequestMethod.POST)
    public String tokengen(@RequestBody Authurization authurization) {
        String tk = token.generateToken(authurization);;
        return tk;
    }
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@RequestBody Authurization authurization) {
        token.saveUser(authurization);
        return "User Created";
    }
}
