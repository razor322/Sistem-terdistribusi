/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.nilai.service;

import com.gybran.nilai.entity.Nilai;
import com.gybran.nilai.repository.NilaiRepository;
import com.gybran.nilai.vo.Mahasiswa;
import com.gybran.nilai.vo.Matkul;
import com.gybran.nilai.vo.ResponseTemplate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Gybran
 */
public class coba {
    @Autowired
    private NilaiRepository nilaiRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Nilai> getNilai() {
        return nilaiRepository.findAll();
    }

    public void insert(Nilai nilai) {
        nilaiRepository.save(nilai);
    }

    public ResponseTemplate getNilai(Long nilaiId) {
        ResponseTemplate vo = new ResponseTemplate();
        
        Nilai nilai = nilaiRepository.findById(nilaiId)
                .orElseThrow(() -> new IllegalStateException("nilai tidak ada"));
        Mahasiswa mahasiswa
                = restTemplate.getForObject("http://localhost:9001/api/v1/mahasiswa/" + nilai.getIdmahasiswa(),
                        Mahasiswa.class
                );

        Matkul matkul
                = restTemplate.getForObject("http://localhost:9002/api/v1/matkul/" + nilai.getIdmatakuliah(),
                        Matkul.class
                );

        vo.setNilai(nilai);
        vo.setMahasiswa(mahasiswa);
        vo.setMatkul(matkul);

        return vo;

    }
}
