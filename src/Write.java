import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    public static void main(String[] args) {


        List<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci("Serhat", "Karakaya", 68, 75));
        ogrenciler.add(new Ogrenci("Sudenur", "Karakaya", 43, 56));
        ogrenciler.add(new Ogrenci("Osman","Kaya",41,65));
        ogrenciler.add(new Ogrenci("Serife","Pak",43,98));
        try {
            File  f =  new File("Student.txt");
            FileWriter fw=null ;
            BufferedWriter bw =null ;


           if( !f.exists()) {
               f.createNewFile();
               System.out.println("dosya olusturuldu:");

           }

           fw = new FileWriter(f,false);
           bw = new BufferedWriter(fw);
           for(Ogrenci o:ogrenciler){
               String satir=(o.getAd()+","+o.getSoyad()+","+o.getVize()+","+o.getFinall());
               bw.write(satir);
               bw.newLine();// bir alt satıra geç


           }
            bw.flush();
            System.out.println("dosyaya başarıyla yazıldı.:");


        }catch (IOException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
