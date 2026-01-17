/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.araclar;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Araclar {

    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Arac uygulamasına hosgeldiniz.");
        System.out.println("lütfen bir secim yapınız.");
        String giris= "1-Kamyonet\n"
                + "2-motosiklet";
        System.out.println(giris);
        
        int secim =a.nextInt();
        if(secim==1){
            Kamyonet kamyonet = new Kamyonet("123","toyota","siyah",4,"marka","model",420);
            System.out.println("1-kamyonun bilgilerini göster\n"
                    + "ceza miktarını göster.");
             int kamyon =a.nextInt();
             if(kamyon==1){
                 kamyonet.aracBilgileri();
             } else if(kamyon==2){
                 kamyonet.trafikCeza(420);
             }else{
                 System.out.println("kamyon için yanlış tuslama yaptınız.");
             }
        }else if(secim==2){
            motosiklet motor=new motosiklet("145","harley davidsan","siyah",2,"marka1","2023",750 );
            System.out.println("1-motorsiklet bilgilerini göster\n"
                    + "2- ceza miktarını göster");
            int motor1=a.nextInt();
            if(motor1==1){
                motor.aracBilgileri();
            }else if(motor1==2){
                motor.trafikCeza(750);
            }else{
                System.out.println(" motor için bilgileriyanlış girdiniz ");
            }
        }else{
            System.out.println("yanlış tuşlama yaptınız tekrar deneyin.");
        }
    }
}
