package com.atakan.service;

import com.atakan.repository.AracRepository;
import com.atakan.repository.entity.Arac;
import com.atakan.utility.MyFactoryService;

import java.util.List;

public class AracService extends MyFactoryService<AracRepository, Arac,Long> {
    AracRepository aracRepository;
    public AracService() {
        super(new AracRepository());
        this.aracRepository= new AracRepository();
    }

    public List<Arac> kiralamaYapilabilecekAraclar() {
        return aracRepository.kiralamaYapilabilecekAraclar();
    }

    public List<Arac> kiradaOlanAraclar() {
        return aracRepository.kiradaOlanAraclar();
    }

    public List<Arac> musteriyeGoreKiraladagiAraclar(Long id) {
        return aracRepository.musteriyeGoreKiraladigiAraclar(id);
    }
}
