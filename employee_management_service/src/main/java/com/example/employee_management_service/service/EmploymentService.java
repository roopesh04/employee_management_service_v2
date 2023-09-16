package com.example.employee_management_service.service;

import com.example.employee_management_service.dao.EmploymentDao;
import com.example.employee_management_service.models.Employment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmploymentService {

    @Autowired
    EmploymentDao employmentDao;

    public Employment saveEmploymentDetails(Employment employee){
        return employmentDao.save(employee);
    }

    public Employment findEmplomentDetmails(String empId){
        Optional<Employment> employmentDetails = employmentDao.findByEmpId(empId);

        if(employmentDetails.isPresent()) return employmentDetails.get();
        return null;
    }
}
