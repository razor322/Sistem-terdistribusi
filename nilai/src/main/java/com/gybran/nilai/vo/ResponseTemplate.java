/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gybran.nilai.vo;

import com.gybran.nilai.entity.Nilai;



/**
 *
 * @author Gybran
 */
public class ResponseTemplate {
    private Nilai nilai;
    private Mahasiswa mahasiswa;
    private Matkul matkul;

    public ResponseTemplate() {
    }

    public ResponseTemplate(Nilai nilai, Mahasiswa mahasiswa, Matkul matkul) {
        this.nilai = nilai;
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        return "ResponseTemplate{" + "nilai=" + nilai + ", mahasiswa=" + mahasiswa + ", matkul=" + matkul + '}';
    }
    
}
