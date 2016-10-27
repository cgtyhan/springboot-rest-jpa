package com.cagatayhan.controller;

import com.cagatayhan.domain.Department;
import com.cagatayhan.domain.Manager;
import com.cagatayhan.service.DepartmentService;
import com.cagatayhan.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/all")
    public List<Department> listAllDepartments() {
        return departmentService.listAllDepartments();
    }

    @RequestMapping(value = "{id}")
    public Department getDepartmentById(@PathVariable("id") int id) {
        return departmentService.getDepartmentById(id);
    }

    @RequestMapping(value = "/add", produces = {"application/json"}, method = RequestMethod.POST)
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteDepartmentById(@PathVariable("id") int id) {
        departmentService.deleteDepartmentById(id);
    }
}
