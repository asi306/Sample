package com.hibernate.maven.spring.dao;

import java.util.List;

import com.hibernate.maven.spring.model.Employee;

public interface EmployeeDao {
	
	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
    
}
