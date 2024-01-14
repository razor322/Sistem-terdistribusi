/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.nilai.controller;

import com.gybran.nilai.entity.Nilai;
import com.gybran.nilai.service.NilaiService;
import com.gybran.nilai.vo.ResponseTemplate;
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
    private NilaiService nilaiService;

//    @GetMapping
//    public void   getAll() {
//         nilaiService.getNilai();
//    }
    @GetMapping
    public  List<Nilai> getAll() {
        return nilaiService.getNilai();
    }

    @PostMapping
    public void insert(@RequestBody Nilai nilai) {
        nilaiService.insert(nilai);
    }

    @GetMapping(path = "{id}")
    public List <ResponseTemplate> getNilai(@PathVariable("id") Long nilaiId) {
        return nilaiService.getNilai(nilaiId);
    }

}
