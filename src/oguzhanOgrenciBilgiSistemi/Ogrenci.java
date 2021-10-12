package oguzhanOgrenciBilgiSistemi;

public class Ogrenci {
    /*
​
2 - Ogrenci adinda bir class olusturun Ogrencinin numarasi, adi, soyadi
ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
getter ve setter methodlari olusturun default constructor ve tum degiskenleri
iceren parametleri constructor olusturun
​
     */

    private String ogrenciNo;
    private String ad;
    private String soyad;
    private Integer ort;
    static int ogrenciSayi = 1000;

    public Ogrenci() {

    }

    public Ogrenci(String ad, String soyad, Integer ort, int yil) {

        setAd(ad);
        setSoyad(soyad);
        setOrt(ort);
        setOgrenciNo(yil);
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int yil) {

        String id = yil +""+ getOrt() + "" + ++ogrenciSayi;

        this.ogrenciNo = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Integer getOrt() {
        return ort;
    }

    public void setOrt(Integer ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {

        return
                "OgrenciNo='" + ogrenciNo + '\'' +
                        ", Ad='" + ad + '\'' +
                        ", Soyad='" + soyad + '\'' +
                        ", Ort=" + ort ;
    }
}









