/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.araclar;

/**
 *
 * @author HP
 */
public class Tasıtlar {
    private  String id;
    private String aracIsmi;
    private String renk;
    private int lastikSayisi;
    private String marka;
    private String model;

    public Tasıtlar(String id, String aracIsmi, String renk, int lastikSayisi, String marka, String model) {
        this.id = id;
        this.aracIsmi = aracIsmi;
        this.renk = renk;
        this.lastikSayisi = lastikSayisi;
        this.marka = marka;
        this.model = model;
    }
    
    public void aracBilgileri(){
        System.out.println("ARAC BİLGİLERİ");
        System.out.println("******************");
    }
    public void trafikCeza( double cezaTutar){
        System.out.println("Trafik cezası");
        System.out.println("******************");
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAracIsmi() {
        return aracIsmi;
    }

    public void setAracIsmi(String aracIsmi) {
        this.aracIsmi = aracIsmi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getLastikSayisi() {
        return lastikSayisi;
    }

    public void setLastikSayisi(int lastikSayisi) {
        this.lastikSayisi = lastikSayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
    
    
}
