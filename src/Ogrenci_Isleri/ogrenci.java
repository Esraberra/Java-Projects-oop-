package Ogrenci_Isleri;

public class ogrenci {
    /*ogrenci adinda bir class olusturun ogrencinin numarasi, adi, soyadi
            ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
    getter ve setter methodlari olusturun default constructor ve tum degiskenleri
    iceren parametleri constructor olusturun*/

    private int ogrenciNumara;
    private String OgrenciAdSoyad;
    private double notOrt;


    ogrenci() {

    }
ogrenci(int ogrenciNumara,String OgrenciAdSoyad, double notOrt){

}
    public void setNotOrt( double notOrt) { // setter parametre alir ve classda bulunan degiskene deger atamak icin kullanilir
       this.notOrt=notOrt;

    }

    public double getNotOrt() {
        return notOrt;
    }

    public void setOgrenciAdSoyad(String ogrenciAdSoyad) {
        this.OgrenciAdSoyad  = ogrenciAdSoyad;
    }

    public String getOgrenciAdSoyad() {
        return OgrenciAdSoyad;
    }

    public void setOgrenciNumara(int ogrenciNumara) {
        this.ogrenciNumara = ogrenciNumara;
    }

    public int getOgrenciNumara() {
        return ogrenciNumara;

    }








}









