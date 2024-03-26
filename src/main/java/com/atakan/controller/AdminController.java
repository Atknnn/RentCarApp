package com.atakan.controller;

import com.atakan.repository.entity.Admin;
import com.atakan.service.AdminService;

public class AdminController {

    AdminService adminService;

    public AdminController(){
        this.adminService = new AdminService();
    }
    public Admin save(Admin admin){
        return adminService.save(admin);
    }

}
