package com.example.employee_management_service.service;

import com.example.employee_management_service.dao.EmployeeDao;
import com.example.employee_management_service.models.Employee;
import com.example.employee_management_service.utils.Constants;
import com.example.employee_management_service.utils.PasswordHashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    PasswordHashUtil passwordHashUtil;

    public Employee findEmployeeDetails(String empId){
        Optional<Employee> employee=employeeDao.findById(empId);

        if(employee.isPresent()) return employee.get();
        return null;
    }

    public Employee insertEmployeeDetails(Employee employee){
        employee.setPassword(passwordHashUtil.encodePassword(Constants.defaultPassword));
        return employeeDao.save(employee);
    }
}
