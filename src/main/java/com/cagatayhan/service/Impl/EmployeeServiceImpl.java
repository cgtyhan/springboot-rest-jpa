package com.cagatayhan.service.Impl;

import com.cagatayhan.domain.Employee;
import com.cagatayhan.repository.EmployeeRepository;
import com.cagatayhan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return (Employee) employeeRepository.findOne(id);
    }
}
