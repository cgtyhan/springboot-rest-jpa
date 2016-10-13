package com.cagatayhan.controller;

import com.cagatayhan.domain.Employee;
import com.cagatayhan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employee> listAllEmployees() {
        return employeeService.listAllEmployees();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }
}
