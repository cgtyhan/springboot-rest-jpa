package com.cagatayhan.service.Impl;

import com.cagatayhan.domain.Manager;
import com.cagatayhan.repository.ManagerRepository;
import com.cagatayhan.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    @Override
    public List<Manager> listAllManagers() {
        return managerRepository.findAll();
    }

    @Override
    public Manager getManagerById(int id) {
        return managerRepository.findOne(id);
    }

    @Override
    public Manager addManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteManagerById(int id) {
        managerRepository.delete(getManagerById(id));
    }
}
