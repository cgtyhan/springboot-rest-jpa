package com.cagatayhan.service;

import com.cagatayhan.domain.Worker;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
public interface WorkerService {
    List<Worker> listAllWorkers();
    Worker getWorkerById(int id);
    Worker addWorker(Worker worker);
    void deleteEmployeeById(int id);
}
