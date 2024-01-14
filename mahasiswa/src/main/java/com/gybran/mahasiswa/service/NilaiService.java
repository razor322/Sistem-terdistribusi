/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.mahasiswa.service;

import com.gybran.mahasiswa.entity.Nilai;
import com.gybran.mahasiswa.repository.NilaiRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gybran
 */
@Service
public class NilaiService {

    @Autowired
    private NilaiRepository nilaiRepository;

    public List<Nilai> getAll() {
        return nilaiRepository.findAll();
    }

    public void insert(Nilai nilai) {
        nilaiRepository.save(nilai);
    }

    public void delete(Long id) {
        boolean ada = nilaiRepository.existsById(id);

        if (!ada) {
            throw new IllegalStateException("nilai matakuliah ini tidak tersedia");
        }
        nilaiRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, Long idmahasiswa, Long idmatakuliah, Double nilai) {
        Nilai nilai1 = nilaiRepository.findById(id).orElseThrow(()
                -> new IllegalStateException("nilai mata kuliah ini tidak"));
    
        if (idmahasiswa != null && !Objects.equals(nilai1.getIdmahasiswa(), idmahasiswa)) {
            nilai1.setIdmahasiswa(idmahasiswa);
        }
        if (idmatakuliah != null && !Objects.equals(nilai1.getIdmatakuliah(), idmatakuliah)) {
            nilai1.setIdmatakuliah(idmatakuliah);
        }
        if (nilai != null && !Objects.equals(nilai1.getNilai(), nilai)) {
            nilai1.setNilai(nilai);
        }
        
       
    
    }
}
