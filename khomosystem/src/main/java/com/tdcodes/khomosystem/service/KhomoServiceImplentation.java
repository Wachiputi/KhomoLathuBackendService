
package com.tdcodes.khomosystem.service;
import com.tdcodes.khomosystem.model.Khomo;
import com.tdcodes.khomosystem.repository.KhomoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class KhomoServiceImplentation implements KhomoService{
    @Autowired
    private KhomoRepository khomoRepository;

    @Override

    public Khomo saveKhomo(Khomo khomo) {
        return khomoRepository.save(khomo);
    }

    @Override
    public List<Khomo> getAllKhomo() {
        return khomoRepository.findAll();
    }
}
