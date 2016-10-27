package com.cagatayhan.controller;

import com.cagatayhan.domain.Worker;
import com.cagatayhan.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    WorkerService workerService;

    @RequestMapping(value = "/all")
    public List<Worker> listAllWorkers() {
        return workerService.listAllWorkers();
    }

    @RequestMapping(value = "{id}")
    public Worker getWorkerById(@PathVariable("id") int id) {
        return workerService.getWorkerById(id);
    }

    @RequestMapping(value = "/add", produces = "application/json", method = RequestMethod.POST)
    public Worker addWorker(@RequestBody Worker worker) {
        return workerService.addWorker(worker);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteWorkerById(@PathVariable("id") int id) {
        workerService.deleteEmployeeById(id);
    }
}
