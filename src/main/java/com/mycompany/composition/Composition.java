/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composition;

/**
 *
 * @author HP
 */
public class Composition {

    public static void main(String[] args) {
       
        öğrenci ogrenci= new öğrenci ("serhat","karakaya" , "hulya","tahir",45);
        System.out.println( ogrenci.ad); 
        OgrenciIsleri OgrenciIsleri= new OgrenciIsleri(ogrenci);
        OgrenciIsleri.ebebeyin();
}
}
