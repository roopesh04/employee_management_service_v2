package com.example.employee_management_service.dao;

import com.example.employee_management_service.models.Employment;
import com.example.employee_management_service.repository.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmploymentDao {

    @Autowired
    EmploymentRepository employmentRepository;

    public Employment save(Employment employment){
        return employmentRepository.save(employment);
    }

    public Optional<Employment> findByEmpId(String empId){
        return employmentRepository.findByEmpId(empId);
    }

    public String findEmployeeManagerId(String empId){
        return findByEmpId(empId).get().getManagerId();
    }
}
