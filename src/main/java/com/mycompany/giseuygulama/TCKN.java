/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giseuygulama;

import java.util.Random;

/**
 *
 * @author HP
 */
public class TCKN {
    private long id;
    private String dogumYeri;
    private String tckn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getTckn() {
        return tckn;
    }
 boolean kontrol = true;
    public void setTckn(String tckn) {
        if(tckn.length()==11){
            for (int i = 0; i <tckn.length(); i++) {
                char karakter =tckn.charAt(i);  // charAt ne işe yarar? 11 haneli tc kimlik no girdiğimiz zmn 10431109302 0. index=1,1.index=0 diye tutar.
                if(Character.isDigit(karakter)){   // isDigit ne işe yarar ? yukarda tutmuş olduğumuz değerlerin sayı mı yoksa harf mi olduğunu anlamak için kullanılır.
                    kontrol = true;
                    
                }else{
            kontrol = false;
            break;
                }
            }
            if(kontrol){
                Random  random = new Random();
                this.tckn = tckn;
                int giseNo=random.nextInt(100);  // math random  rastgele bir sayı üretmek için kullanılır.
                sonucGoster("gise no:"+giseNo);
            }else{
                  sonucGoster(" lütfen karakterleri rakam giriniz");
            }
            // this.tckn = tckn;
        }else{
           sonucGoster(" lütfen 11 hane giriniz");
          
        }
       
    }
    public void sonucGoster(String sonuc){
        System.out.println(sonuc);
    }
    
}
