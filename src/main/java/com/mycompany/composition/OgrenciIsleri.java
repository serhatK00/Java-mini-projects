/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition;

/**
 *
 * @author HP
 */
public class OgrenciIsleri {
public öğrenci ogrenci;
    public OgrenciIsleri(öğrenci ogrenci1) {
        this.ogrenci = ogrenci1;
    }
    public void ekle() {
        System.out.println("öğrenci eklendi."+ogrenci.ad);
        
}
    public void ebebeyin(){
        System.out.println("anne adı: "+ ogrenci.AnaAdi+"/" + " baba adı: " + ogrenci.BabaAdi);
    }
}
