package com.h2db.h2db.dao;

import com.h2db.h2db.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    List<Employee> findAllByDeptName(String deptName);
}
