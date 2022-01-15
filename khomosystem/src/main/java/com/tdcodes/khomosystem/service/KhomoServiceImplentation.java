//a package called service
package com.tdcodes.khomosystem.service;

//import elements of java
import com.tdcodes.khomosystem.model.Khomo;
import com.tdcodes.khomosystem.repository.KhomoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//imports java from java libraries
import java.util.List;

@Service
//creates class
public class KhomoServiceImplentation implements KhomoService{
    @Autowired
    private KhomoRepository khomoRepository;
//annotation
    @Override
    //a method
    public Khomo saveKhomo(Khomo khomo) {
        return khomoRepository.save(khomo);
    }
//annotation
    @Override
    public List<Khomo> getAllKhomo() {
        return khomoRepository.findAll();
    }
}
