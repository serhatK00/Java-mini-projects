/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ucgenyapma;

/**
 *
 * @author HP
 */
public class UcgenYapma {

    public static void main(String[] args) {
       // eşkenar üçgen  
        
       int a,b,c;
        for ( a = 1; a<=10; a++) { // döngümüzün ne kadar döneceğini belirliyoruz/satırlar
           for ( b = a; b < 10; b++) {//üçgenimizi yaparken üçgende sol tarafta kaç tane boşluk olacak
               System.out.print(" ");// boşlukları belirtiyoruz
            }
            for (c = 1; c <=a;c++){ // yıldız sembolümüzün yazılmasını sağlıyoruz
                System.out.print("*");// yıldızı yazdırıyoruz
                System.out.print(" ");
            }
            System.out.println(" ");
            
        
        }  
        
        
        System.out.println("////////////////////////////////////////");
        // ters eşkenar üçgen 
       int i,j,k;
        for ( i = 10; i >=1; i--) { // döngümüzün ne kadar döneceğini belirliyoruz/satırlar
           for ( j = i; j < 10; j++) {//üçgenimizi yaparken üçgende sol tarafta kaç tane boşluk olacak
               System.out.print(" ");// boşlukları belirtiyoruz
            }
            for (k = 1; k <=i;k++){ // yıldız sembolümüzün yazılmasını sağlıyoruz
                System.out.print("*");// yıldızı yazdırıyoruz
                System.out.print(" ");
            }
            System.out.println(" ");
            
        
        }
        System.out.println("/////////////////////////////////////////////////////");
        // dik üçgen 
        
         int m,n;
        int serhat=0;
        for (m=0;m<9;m++){
            for(n=0;n<serhat;n++){
                System.out.print("*");
            }
            System.out.println(" ");
            serhat++;
        }
        
        System.out.println("//////////////////////////////////////////////////////////");
        
       
        
        
        //ters dik üçgen
        int d,e;
        int sembol=9;
        for (d=0;d<9;d++){
            for(e=0;e<sembol;e++){
                System.out.print("*");
            }
            System.out.println(" ");
            sembol--;
        }
    }
}
