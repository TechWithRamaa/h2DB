package com.h2db.h2db.controller;

import com.h2db.h2db.dao.EmployeeRepository;
import com.h2db.h2db.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee Saved";
    }

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("employees/{deptName}")
    public List<Employee> getEmployeeByDepartmentId(@PathVariable String deptName){
        return employeeRepository.findAllByDeptName(deptName);
    }
}
