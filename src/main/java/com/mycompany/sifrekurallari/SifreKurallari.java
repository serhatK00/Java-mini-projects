/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sifrekurallari;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SifreKurallari {

    public static void main(String[] args) {
       /*
        Bazı web siteleri şifre için farklı kurallar uygularlar. String olarak klavyeden girilen bir şifrenin aşağıdaki kuralları sağlaması gerekir. 
Şifre en az sekiz karakterden oluşmalıdır, Şifre sadece karakter ve rakamlardan oluşmalıdır, Şifre en az iki rakam içermelidir. 
Girilen bir şifrenin yukarıdaki kurallara göre geçerli olup olmadığını bulan bir Java programı yazınız.
        */
        System.out.println("merhabalar hoş geldiniz ");
        System.out.println( " kayıt olmak için kullanıcı adınızı ve şifrenizi oluşturun. ");
        Scanner a = new Scanner(System.in);
        System.out.print("kullanıcı ad:");
        String kullaniciAd= a.nextLine();
        System.out.print("sifre: ");
        String sifre=a.nextLine();
    
        int rakamSayisi =0;
        if(sifre.length()>=8){
        }else{
            System.out.println("şifreniz en az 8 elemanlı olmalıdır.");
        }
        for (int i = 0; i < sifre.length(); i++) {    
        char karakter= sifre.charAt(i);
        if( ! Character.isLetterOrDigit(karakter)){    // sifrenin sayı ve harf kontrolünü yaptım.
         System.out.println("");
        break;
        }
        }
        for (int i = 0; i < sifre.length(); i++) {    
                    char karakter= sifre.charAt(i);
            if(Character.isDigit(karakter)){
                rakamSayisi++;
            } 
            if( rakamSayisi<2){
                 System.out.println("rakam sayısı en az 2 olmalıdır.");
             }
        }
        }
        }


 







 