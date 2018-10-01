package com.project.maths.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.maths.entity.Employee;
import com.project.maths.repository.EmployeeRepository;
import com.project.maths.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee addEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }


    @Override
    public Page<Employee> getAllEmployees(Pageable pageable)
    {
        return employeeRepository.findAll(pageable);
    }


    @Override
    public String deleteEmployee(Integer empId)
    {
        String response = "Deleted Successfully";
        employeeRepository.deleteById(empId);;
        return response;
    }


    @Override
    public Employee updateEmployee(Employee employee)
    {
        // Same Save is used to Update The record if it already Exists
        return employeeRepository.save(employee);
    }


    @Override
    public Employee getEmployee(Integer empId)
    {
        return employeeRepository.findById(empId).get();
    }

}
