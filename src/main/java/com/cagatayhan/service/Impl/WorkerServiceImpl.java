package com.cagatayhan.service.Impl;

import com.cagatayhan.domain.Worker;
import com.cagatayhan.repository.WorkerRepository;
import com.cagatayhan.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Service
public class WorkerServiceImpl implements WorkerService{
    @Autowired
    WorkerRepository workerRepository;

    @Override
    public List<Worker> listAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorkerById(int id) {
        return (Worker) workerRepository.findOne(id);
    }
}
