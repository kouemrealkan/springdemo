package com.emrealkan.motoraskicom.springbackend.rest;

import com.emrealkan.motoraskicom.springbackend.entity.Admin;
import com.emrealkan.motoraskicom.springbackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminRestController {
    private AdminService adminService;
    @Autowired
    public AdminRestController(AdminService theAdminService){
        adminService = theAdminService;
    }

   @GetMapping("/admins")
    public List<Admin> findAll(){
        return adminService.findAll();
   }
}
