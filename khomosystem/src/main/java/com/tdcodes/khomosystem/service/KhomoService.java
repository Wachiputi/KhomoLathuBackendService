
package com.tdcodes.khomosystem.service;

import com.tdcodes.khomosystem.model.Khomo;

import java.util.List;

public interface KhomoService {

    public Khomo saveKhomo(Khomo khomo);
    public List<Khomo> getAllKhomo();
}
