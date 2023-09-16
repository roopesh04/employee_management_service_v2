package com.example.employee_management_service.controllers;

import com.example.employee_management_service.models.Employee;
import com.example.employee_management_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee findEmployeeDetails(@PathVariable("id") String empId){
        return employeeService.findEmployeeDetails(empId);
    }

    @PostMapping
    public Employee saveEmployeeData(@RequestBody Employee employee){
        return employeeService.insertEmployeeDetails(employee);
    }
}
