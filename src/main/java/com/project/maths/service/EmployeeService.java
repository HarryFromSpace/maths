package com.project.maths.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.project.maths.entity.Employee;

public interface EmployeeService
{

    Employee addEmployee(Employee employee);


    Page<Employee> getAllEmployees(Pageable pageable);


    String deleteEmployee(Integer empId);


    Employee updateEmployee(Employee employee);


    Employee getEmployee(Integer empId);

}
