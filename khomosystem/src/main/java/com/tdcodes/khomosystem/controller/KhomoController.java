package com.tdcodes.khomosystem.controller;
import com.tdcodes.khomosystem.model.Khomo;
import com.tdcodes.khomosystem.service.KhomoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khomo")
@CrossOrigin
public class KhomoController {
    @Autowired
    private KhomoService khomoService;

    @PostMapping("/add")
    public String add(@RequestBody Khomo khomo){
        khomoService.saveKhomo(khomo);
        return "New khomo is added";
    }
    @GetMapping("/getAll")
    public List<Khomo> getAllKhomo(){
        return khomoService.getAllKhomo();
    }
}
