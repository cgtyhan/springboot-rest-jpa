package com.cagatayhan.service;

import com.cagatayhan.domain.Department;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
public interface DepartmentService {
    List<Department> listAllDepartments();
    Department getDepartmentById(int id);
}
