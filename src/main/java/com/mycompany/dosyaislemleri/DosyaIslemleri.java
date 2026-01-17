/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dosyaislemleri;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DosyaIslemleri {

    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            writer= new FileWriter("dosyaIslemleri.txt",true);
            writer.write("dosya oluşturuldu.\n");
            writer.write("dosya içeriği ffelan\n");
            reader =  new FileReader("dosyaIslemleri.txt");
           Scanner scanner = new Scanner( new FileReader("dosyaIslemleri.txt"));    // FileReader kullanırken scanner kullanılır.
           while(scanner.hasNextLine()){
               System.out.println(scanner.nextLine());
           }
            
        } catch (IOException ex) {
            
            System.out.println("dosya oluşurken bir hata oluştu.");
        }finally{
            try {
                writer.close();
            } catch (IOException ex) {
                System.out.println("dosya kapaltılırken bir hata oluştu.");
            }
        }
       
    }

    
}
