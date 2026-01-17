/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.giseuygulama;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GiseUygulama {

    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
        
        System.out.println(" *****gişe uygulamasına hosgeldiniz.*****");
        System.out.println(" lütfen 11 haneli T.C kimlik numaranızı giriniz.");
        String tc =a.nextLine();
        TCKN nesne = new TCKN();
        nesne.setTckn(tc);
        
    }
}
