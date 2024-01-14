/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.matkul.controller;

import com.gybran.matkul.entity.Matkul;
import com.gybran.matkul.service.MatkulService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gybran
 */
@RestController
@RequestMapping("api/v1/matkul")
public class MatkulController {

    @Autowired
    private MatkulService matkulservice;
    
    @GetMapping
    public List<Matkul> getAll() {
        return matkulservice.getAll();
    }
    @GetMapping(path = "{id}")
    public Matkul getMatkul(@PathVariable("id") Long id) {
        return matkulservice.getMatkul(id);
    }

    @PostMapping
    public void insert(@RequestBody Matkul matkul) {
        matkulservice.insert(matkul);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id) {
        matkulservice.delete(id);
    }

    @PutMapping(path = "{id}")
    public void update(@PathVariable("id") Long id,
            @RequestParam(required = false) String kode,
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer sks) {
        matkulservice.update(id, kode, nama, sks);
    }

}
