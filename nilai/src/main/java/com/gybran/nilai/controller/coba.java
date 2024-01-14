/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.nilai.controller;

import com.gybran.nilai.entity.Nilai;
import com.gybran.nilai.service.NilaiService;
import com.gybran.nilai.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Gybran
 */
public class coba {
    
    @Autowired
    private NilaiService nilaiseviService;

    @PostMapping
    public void insert(@RequestBody Nilai nilai) {
        nilaiseviService.insert(nilai);
    }

    @GetMapping(path = "{id}")
    public ResponseTemplate getNilai(@PathVariable("id") Long nilaiId) {
        return nilaiseviService.getNilai(nilaiId);
    }
}
