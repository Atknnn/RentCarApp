package com.atakan.service;

import com.atakan.repository.KisiRepository;
import com.atakan.repository.entity.Kisi;
import com.atakan.utility.MyFactoryService;

import java.util.Optional;

public class KisiService extends MyFactoryService<KisiRepository, Kisi,Long> {
    KisiRepository kisiRepository;
    public KisiService() {
        super(new KisiRepository());
        this.kisiRepository = new KisiRepository();
    }

    public Optional<Kisi> findByUsername(String username) {
        return kisiRepository.findByUsername(username);
    }
}
