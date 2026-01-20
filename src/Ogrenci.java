public class Ogrenci {
  private String ad;
  private String soyad;
  private  double vize;
  private double finall;


    public Ogrenci(String ad, String soyad, double vize, double finall) {
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.finall = finall;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;}

    public double getVize() {
        return vize;
    }

    public double getFinall() {
        return finall;
    }
public double NotHesapla() {
    return(vize*0.4)+(finall*0.6);
    }




  }





