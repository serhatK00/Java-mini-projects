import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) {

        List<Ogrenci>kayitEdililenler=new ArrayList<Ogrenci>();
        FileReader fr;
        String satir;

        {
            try {
                fr = new FileReader("Student.txt");
                BufferedReader br = new BufferedReader(fr);
                while ((satir = br.readLine()) != null) {// neden null verdik? NullPointerException hatası yememek için.
                    String[] veriler = satir.split(",");//virgülden virgüle veri bölmeye yarar.

                    String ad = veriler[0];
                    String soyad = veriler[1];
                    double vize=Double.parseDouble(veriler[2]);
                    double finall=Double.parseDouble(veriler[3]);
                    Ogrenci o = new Ogrenci(ad,soyad, (double) vize, (double) finall);
                    kayitEdililenler.add(o);
                }

                System.out.println("***Öğrenci Sonuç Listesi***");
                for(Ogrenci ogrenci:kayitEdililenler){
                    double ort= ogrenci.NotHesapla();
                    System.out.println(ogrenci.getAd()+" "+ ogrenci.getSoyad()+"  -> ortalaması:"+ort);
                }



            } catch (FileNotFoundException e) {
                System.out.println("File Not Found");
            } catch (IOException e) {
                System.out.println("IO Error");
            }
        }
    }
}