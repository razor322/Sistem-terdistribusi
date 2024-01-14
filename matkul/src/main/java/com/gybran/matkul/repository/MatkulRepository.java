/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gybran.matkul.repository;

import com.gybran.matkul.entity.Matkul;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gybran
 */
@Repository
public interface MatkulRepository extends JpaRepository<Matkul, Long> {

//    public Optional<Matkul> findMatakuliahByKode(String kode);

//    public Optional<Matkul> findMatkulByNama(String nama);
//
//    public Optional<Matkul> findMatkulByKode(String kode);
//
//    public Optional<Matkul> findMatkulBySks(Integer sks);

    public Optional<Matkul> findMatkulByNama(String nama);

    public Optional<Matkul> findMatkulByKode(String kode);
    
}
