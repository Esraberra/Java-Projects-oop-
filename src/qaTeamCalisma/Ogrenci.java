package qaTeamCalisma;

public class Ogrenci {

    //   Ogrenci adinda bir class olusturun Ogrencinin numarasi, adi, soyadi
//   ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
//   getter ve setter methodlari olusturun default constructor ve tum degiskenleri
//   iceren parametleri constructor olusturun
//
    private String no;
    private String ad;
    private String soyAd;
    private double ort;
    public Ogrenci() {
        super();
    }
    public Ogrenci(String no, String ad, String soyAd, double ort) {
        super();
        this.no = no;
        this.ad = ad;
        this.soyAd = soyAd;
        this.ort = ort;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyAd() {
        return soyAd;
    }
    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }
    public double getOrt() {
        return ort;
    }
    public void setOrt(double ort) {
        this.ort = ort;
    }
    @Override
    public String toString() {
        return "Ogrenci [no=" + no + ", ad=" + ad + ", soyAd=" + soyAd + ", ort=" + ort + "]";
    }



}


