package com.cagatayhan.controller;

import com.cagatayhan.domain.Department;
import com.cagatayhan.domain.Manager;
import com.cagatayhan.service.DepartmentService;
import com.cagatayhan.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/all")
    public List<Department> listAllDepartments() {
        return departmentService.listAllDepartments();
    }

    @RequestMapping("{id}")
    public Department getDepartmentById(@PathVariable("id") int id) {
        return departmentService.getDepartmentById(id);
    }
}
