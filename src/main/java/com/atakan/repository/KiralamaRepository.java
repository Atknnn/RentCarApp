package com.atakan.repository;

import com.atakan.repository.entity.Kiralama;
import com.atakan.repository.views.KiralamaSayisi;
import com.atakan.repository.views.KiralananAraclar;
import com.atakan.utility.HibernateUtility;
import com.atakan.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class KiralamaRepository extends MyFactoryRepository<Kiralama,Long> {
    EntityManager entityManager;
    public KiralamaRepository() {
        super(new Kiralama());
        this.entityManager= HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<KiralananAraclar> raporlama() {
        String sql="SELECT a.id,a.marka,a.model,a.durum,k.baslangictarihi,k.bitistarihi,ki.name,ki.surname " +
                "FROM tbl_arac a INNER JOIN tbl_kiralama k ON k.arac_id=a.id " +
                "INNER JOIN tbl_kisi ki ON k.kisi_id=ki.id";
        Query query = entityManager.createNativeQuery(sql, KiralananAraclar.class);
        return query.getResultList();
    }

    public List<KiralamaSayisi> kiralamaSayisi() {
        String sql= "SELECT a.id,a.marka,a.model, COUNT(k.id) kiralamasayisi FROM tbl_arac a INNER JOIN tbl_kiralama k ON k.arac_id=a.id GROUP BY(a.id);";
        Query query = entityManager.createNativeQuery(sql, KiralamaSayisi.class);
        return query.getResultList();
    }
}
