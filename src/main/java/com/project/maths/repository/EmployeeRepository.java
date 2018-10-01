package com.project.maths.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.maths.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>
{

}
