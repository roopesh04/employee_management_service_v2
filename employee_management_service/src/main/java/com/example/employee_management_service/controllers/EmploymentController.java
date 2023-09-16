package com.example.employee_management_service.controllers;

import com.example.employee_management_service.models.Employment;
import com.example.employee_management_service.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employment")
public class EmploymentController {

    @Autowired
    EmploymentService employmentService;


    @GetMapping("/{id}")
    public Employment findEmployeeDetails(@PathVariable("id") String empId){
        return employmentService.findEmplomentDetmails(empId);
    }

    @PostMapping
    public Employment saveEmployeeData(@RequestBody Employment employment){
        return employmentService.saveEmploymentDetails(employment);
    }

}
