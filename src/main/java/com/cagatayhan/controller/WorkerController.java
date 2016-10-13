package com.cagatayhan.controller;

import com.cagatayhan.domain.Worker;
import com.cagatayhan.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    WorkerService workerService;

    @RequestMapping("/all")
    public List<Worker> listAllWorkers() {
        return workerService.listAllWorkers();
    }

    @RequestMapping("{id}")
    public Worker getWorkerById(@PathVariable("id") int id) {
        return workerService.getWorkerById(id);
    }
}
