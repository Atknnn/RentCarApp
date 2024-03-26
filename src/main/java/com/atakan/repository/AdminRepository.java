package com.atakan.repository;

import com.atakan.repository.entity.Admin;
import com.atakan.utility.MyFactoryRepository;

public class AdminRepository extends MyFactoryRepository<Admin,Long> {
    public AdminRepository() {
        super(new Admin());
    }
}
