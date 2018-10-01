package com.project.maths.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.maths.entity.Employee;
import com.project.maths.service.EmployeeService;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        Employee newEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok(newEmployee);
    }


    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployees(@PathVariable("id") Integer empId)
    {
        Employee employee = employeeService.getEmployee(empId);
        return ResponseEntity.ok(employee);
    }


    @GetMapping("/employee")
    public ResponseEntity<Page<Employee>> getAllEmployees(Pageable pageable)
    {
        Page<Employee> pageOfEmployee = employeeService.getAllEmployees(pageable);
        return ResponseEntity.ok(pageOfEmployee);
    }


    @DeleteMapping("/employee")
    public ResponseEntity<String> deleteEmployee(@RequestParam("empId") Integer empId)
    {
        String response = employeeService.deleteEmployee(empId);
        return ResponseEntity.accepted().body(response);
    }


    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
}
