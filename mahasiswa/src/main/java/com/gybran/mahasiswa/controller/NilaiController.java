/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.mahasiswa.controller;

import com.gybran.mahasiswa.entity.Nilai;
import com.gybran.mahasiswa.service.NilaiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gybran
 */
@RestController
@RequestMapping("api/v1/nilai")
public class NilaiController {

    @Autowired
    private NilaiService nilaiseviService;

    @GetMapping
    public List<Nilai> getAll() {
        return nilaiseviService.getAll();
    }

    @PostMapping
    public void insert(@RequestBody Nilai nilai) {
        nilaiseviService.insert(nilai);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete (@PathVariable("id") Long id,
            @RequestParam(required = false)Long idmahasiswa,
            @RequestParam(required = false)Long matakuliah,
            @RequestParam(required = false)Double nilai
            )
            {
                nilaiseviService.update(id, idmahasiswa, matakuliah, nilai);
    }
    

}
