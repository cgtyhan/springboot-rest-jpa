package com.cagatayhan.service;

import com.cagatayhan.domain.Manager;

import java.util.List;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
public interface ManagerService {
    List<Manager> listAllManagers();
    Manager getManagerById(int id);
}
