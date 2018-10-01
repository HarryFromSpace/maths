package com.project.maths.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee")
@Entity
public class Employee implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(length = 20, unique = true)
    private String name;
    @Column
    private Integer id;
    @Column
    private String company;
    @Column
    private Sex gender;
    @Column
    private Double salary;
    @Column
    transient private String password;

    public enum Sex
    {
        Male, Female
    };


    public Employee()
    {
        super();
    }


    public Employee(String name, Integer id, String company)
    {
        super();
        this.name = name;
        this.id = id;
        this.company = company;
    }


    public Employee(String name, Integer id, String company, Sex gender)
    {
        super();
        this.name = name;
        this.id = id;
        this.company = company;
        this.gender = gender;
    }


    public Employee(String name, Integer id, String company, Sex gender, Double salary)
    {
        super();
        this.name = name;
        this.id = id;
        this.company = company;
        this.gender = gender;
        this.salary = salary;
    }


    public Employee(String name, Integer id, String company, Sex gender, Double salary, String password)
    {
        super();
        this.name = name;
        this.id = id;
        this.company = company;
        this.gender = gender;
        this.salary = salary;
        this.password = password;
    }


    public Employee(Integer empId, String name, Integer id, String company, Sex gender, Double salary, String password)
    {
        super();
        this.empId = empId;
        this.name = name;
        this.id = id;
        this.company = company;
        this.gender = gender;
        this.salary = salary;
        this.password = password;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public String getCompany()
    {
        return company;
    }


    public void setCompany(String company)
    {
        this.company = company;
    }


    public Sex getGender()
    {
        return gender;
    }


    public void setGender(Sex gender)
    {
        this.gender = gender;
    }


    public Double getSalary()
    {
        return salary;
    }


    public void setSalary(Double salary)
    {
        this.salary = salary;
    }


    public String getPassword()
    {
        return password;
    }


    public void setPassword(String password)
    {
        this.password = password;
    }


    public Integer getEmpId()
    {
        return empId;
    }


    public void setEmpId(Integer empId)
    {
        this.empId = empId;
    }


    @Override
    public String toString()
    {
        return "Employee [name=" + name + ", id=" + id + ", company=" + company + ", gender=" + gender + ", salary=" + salary + ", password=" + password + "]";
    }


    public void salaryIncrement(Double percentage)
    {
        this.salary *= (100 + percentage) / 100;
    }


    public Employee finById(int id)
    {
        return this;
    }
}
