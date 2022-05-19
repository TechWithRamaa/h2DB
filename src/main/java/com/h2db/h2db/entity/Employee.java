package com.h2db.h2db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String deptName;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String deptName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.deptName = deptName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptId) {
        this.deptName = deptId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", deptId='" + deptName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
