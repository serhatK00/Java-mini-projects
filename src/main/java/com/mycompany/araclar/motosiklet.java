/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.araclar;

/**
 *
 * @author HP
 */
public class motosiklet extends Tasıtlar {
    private int ceza=0;
    public motosiklet(String id, String aracIsmi, String renk, int lastikSayisi, String marka, String model,int ceza) {
        super(id, aracIsmi, renk, lastikSayisi, marka, model);
        this.ceza=ceza;
    }
     @Override
    public void trafikCeza(double cezaTutar) {
        super.trafikCeza(cezaTutar); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(ceza);
        System.out.println("ceza tutarı:"+getCeza());
    }

    @Override
    public void aracBilgileri() {
        super.aracBilgileri(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("ID:"+getId());
        System.out.println("ARAC İSMİ :"+getAracIsmi() );
        System.out.println(" ARAC RENK :"+getRenk());
        System.out.println("LASTİK SAYISI:"+getLastikSayisi());
        System.out.println("ARAC MARKA:"+getMarka());
        System.out.println("ARAC MODEL:"+getModel());
        
        
    }

    public int getCeza() {
        return ceza;
    }

    public void setCeza(int ceza) {
        this.ceza = ceza;
    }
}
