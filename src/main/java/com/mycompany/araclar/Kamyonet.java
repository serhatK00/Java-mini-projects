/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.araclar;

/**
 *
 * @author HP
 */
public class Kamyonet extends Tasıtlar  {
 private double ceza=0;
    public Kamyonet(String id, String aracIsmi, String renk, int lastikSayisi, String marka, String model,double ceza) {
//        setId(id);
//        setAracIsmi(aracIsmi);
//        setRenk(renk);
//        setLastikSayisi(lastikSayisi);
//        setMarka(marka);
//        setModel(model);
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
    

    public double getCeza() {
        return ceza;
    }

    public void setCeza(double ceza) {
        this.ceza = ceza;
    }
 
}