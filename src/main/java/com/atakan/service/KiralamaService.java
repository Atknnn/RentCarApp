package com.atakan.service;

import com.atakan.repository.KiralamaRepository;
import com.atakan.repository.entity.Kiralama;
import com.atakan.repository.views.KiralamaSayisi;
import com.atakan.repository.views.KiralananAraclar;
import com.atakan.utility.MyFactoryService;

import java.util.List;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    KiralamaRepository kiralamaRepository;
    public KiralamaService() {
        super(new KiralamaRepository());
        this.kiralamaRepository=new KiralamaRepository();
    }

    public List<KiralananAraclar> raporlama() {
        return kiralamaRepository.raporlama();
    }

    public List<KiralamaSayisi> kiralamaSayisi() {
        return kiralamaRepository.kiralamaSayisi();
    }
}
