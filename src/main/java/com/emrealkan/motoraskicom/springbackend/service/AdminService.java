package com.emrealkan.motoraskicom.springbackend.service;

import com.emrealkan.motoraskicom.springbackend.entity.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> findAll();
    public void save(Admin theAdmin);
}
