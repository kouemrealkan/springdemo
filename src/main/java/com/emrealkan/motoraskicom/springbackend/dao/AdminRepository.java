package com.emrealkan.motoraskicom.springbackend.dao;

import com.emrealkan.motoraskicom.springbackend.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
