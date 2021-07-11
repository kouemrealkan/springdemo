package com.emrealkan.motoraskicom.springbackend.service;

import com.emrealkan.motoraskicom.springbackend.dao.AdminRepository;
import com.emrealkan.motoraskicom.springbackend.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    private AdminRepository adminRepository;
    @Autowired
    public AdminServiceImpl(AdminRepository theAdminRepository){
        adminRepository = theAdminRepository;
    }
    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public void save(Admin theAdmin) {
        adminRepository.save(theAdmin);
    }

}
