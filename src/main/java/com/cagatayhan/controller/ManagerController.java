package com.cagatayhan.controller;

import com.cagatayhan.domain.Employee;
import com.cagatayhan.domain.Manager;
import com.cagatayhan.service.EmployeeService;
import com.cagatayhan.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@RestController
@RequestMapping("/managers")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @RequestMapping(value = "/all")
    public List<Manager> listAllManagers() {
        return managerService.listAllManagers();
    }

    @RequestMapping(value = "{id}")
    public Manager getManagerById(@PathVariable("id") int id) {
        return managerService.getManagerById(id);
    }

    @RequestMapping(value = "/add", produces = {"application/json"}, method = RequestMethod.POST)
    public Manager addManager(@RequestBody Manager manager) {
        return managerService.addManager(manager);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteManagerById(@PathVariable("id") int id) {
        managerService.deleteManagerById(id);
    }
}
