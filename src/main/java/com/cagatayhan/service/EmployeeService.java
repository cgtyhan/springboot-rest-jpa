package com.cagatayhan.service;

import com.cagatayhan.domain.Department;
import com.cagatayhan.domain.Employee;
import com.cagatayhan.domain.Manager;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
public interface EmployeeService {
    List<Employee> listAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    void deleteEmployeeById(int id);
}
