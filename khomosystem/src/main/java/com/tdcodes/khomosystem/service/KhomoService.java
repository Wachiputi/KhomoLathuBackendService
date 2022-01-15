//a package service
package com.tdcodes.khomosystem.service;
//imports entities from the libraries
import com.tdcodes.khomosystem.model.Khomo;

import java.util.List;
//creates an interface
public interface KhomoService {
    //creates a method of return type khomo
    public Khomo saveKhomo(Khomo khomo);
    //a parameter to get khomo entities from the database
    public List<Khomo> getAllKhomo();
}
