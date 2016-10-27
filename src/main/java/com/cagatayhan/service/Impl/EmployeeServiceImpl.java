package com.cagatayhan.service.Impl;

import com.cagatayhan.domain.Employee;
import com.cagatayhan.domain.Manager;
import com.cagatayhan.domain.Worker;
import com.cagatayhan.repository.EmployeeRepository;
import com.cagatayhan.repository.ManagerRepository;
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
        return employeeRepository.findOne(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.delete(getEmployeeById(id));
    }
}
