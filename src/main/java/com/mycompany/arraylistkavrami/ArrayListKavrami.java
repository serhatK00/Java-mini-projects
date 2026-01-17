/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistkavrami;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ArrayListKavrami {

    public static void main(String[] args) {
       ArrayList  list = new ArrayList ();
       list.add("serhat");
       list.add(5);
       list.add(21.5);
       // yukarıda görüldüğü gibi integer/string/double farketmeksizin aldı.
       ArrayList<String> listt = new ArrayList<String> ();// böyle yaparsam sadece string alır.
       listt.add("osman");
       listt.add("veli");     // add metodu veri eklemeyi sağlar.
       listt.add("namık");
       listt.add("buse");
       listt.add( 1,"kemal");  // ad metodunun diğer görevi 1. index e kemali ekle .
       listt.remove(2);              // remove metodu     2. indexi sil 
       listt.remove( "buse");           // remove metodunun diğer görevi buse olanı sil.
       listt.set(2, "tahir");  // set metodu  2. indexteki veriyi" namık" i tahir ile değiştir/güncelle.
        System.out.println(listt);      // listt nesnesinde bulunan tüm verileri yazdırmak için kullanılır.
        
        
        
        /*
     ArrayList: Rastgele erişim hızlı, ancak ekleme ve silme işlemleri maliyetli olabilir.
     LinkedList: Ekleme ve silme işlemleri hızlı, ancak rastgele erişim daha yavaştır ve hafıza kullanımı daha yüksektir.
        */
       
    }
}
