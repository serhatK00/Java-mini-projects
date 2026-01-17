/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deneme01;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Deneme01 {
 public static boolean aktif=true;
     public static int hakSayisi=3; 
    
    public static void main(String[] args) {
   // kullanıcın uygulamaya girmesi için 3 hakkı var aşarsa siteye giremez.
   Scanner a= new Scanner(System.in);
        if (aktif) {
            
            if (hakSayisi>0) {
                while (aktif){
                    System.out.println("kullanıcı adınızı giriniz.");
                    String username = a.nextLine();
                    System.out.println("sifrenizi giriniz.");
                    String password=a.nextLine();
                    boolean sonuc = login(username,password);
                    if(sonuc==true){            //
                        System.out.println("basarılı");
                        break;
                        
                    }else{
                        if(hakSayisi==0){
                            aktif=false;
                            break;
                        }
                    }
                    if(aktif==false){
                        System.out.println("hak sayınız doldu.");
                    }
                }
            }else{
                System.out.println("hesabınız bloke olmuştur.");
            }
          
        
       
        }else{
            System.out.println("sisteme giriş izniniz yoktur.");
        }
    }
    public static boolean login(String username,String password){
        if(username.equals("serhat")&&password.equals("123")){
           
        }else{
            System.out.println("hatalı giris");
            hakSayisi --;
            
            
         if(hakSayisi==0){
             aktif=false;
         }
            return false;
        }
     
     
       return false;
        
    }
}
