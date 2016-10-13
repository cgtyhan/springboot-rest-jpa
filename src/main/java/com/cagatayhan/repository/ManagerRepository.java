package com.cagatayhan.repository;

import com.cagatayhan.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
