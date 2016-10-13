package com.cagatayhan.controller;

import com.cagatayhan.domain.Manager;
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
@RequestMapping("/managers")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @RequestMapping("/all")
    public List<Manager> listAllManagers() {
        return managerService.listAllManagers();
    }

    @RequestMapping("{id}")
    public Manager getManagerById(@PathVariable("id") int id) {
        return managerService.getManagerById(id);
    }
}
