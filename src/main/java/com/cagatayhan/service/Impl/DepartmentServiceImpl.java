package com.cagatayhan.service.Impl;

import com.cagatayhan.domain.Department;
import com.cagatayhan.repository.DepartmentRepository;
import com.cagatayhan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> listAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(int id) {
        return (Department) departmentRepository.findOne(id);
    }
}
