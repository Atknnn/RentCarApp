package com.atakan.service;

import com.atakan.repository.AdminRepository;
import com.atakan.repository.entity.Admin;
import com.atakan.utility.MyFactoryService;

public class AdminService extends MyFactoryService<AdminRepository, Admin,Long> {
    AdminRepository adminRepository;
    public AdminService() {
        super(new AdminRepository());
        this.adminRepository = new AdminRepository();
    }
}
