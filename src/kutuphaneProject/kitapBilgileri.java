package kutuphaneProject;

public class kitapBilgileri {
    private String kitapIsmi;
private int seriNo;
private String yazarAdSoyad;
private int cikisTarihi;


    /*KitapBilgileri adinda bir class olusturun kitabin seri numarasi, adi, yazari
            ve cikis tarihi degiskenlerini private access modifier kullanarak olusturun
    getter ve setter methodlari olusturun default constructor ve tum degiskenleri
    iceren parametleri constructor olusturun*/


    public void setKitapIsmi(String kitapIsmi) {
        this.kitapIsmi = kitapIsmi;
    }
public String getkitapIsmi(){
        return kitapIsmi;
}
    public kitapBilgileri(String kitapIsmi, String yazarAdSoyad, int cikisTarih){
        this.kitapIsmi=kitapIsmi;
        this.yazarAdSoyad=yazarAdSoyad;
        this.cikisTarihi=cikisTarih;

    }


    public void setCikisTarihi(int cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }


    public void setYazarAdSoyad(String yazarAdSoyad) {
        this.yazarAdSoyad=yazarAdSoyad;

    }

    @Override
    public String toString() {
        return "Kitap Bilgileri {" +
                "Kitap Ismi :'" + kitapIsmi + '\'' +

                ", Yazar Ad Soyad :'" + yazarAdSoyad + '\'' +
                ", Cikis Tarihi :" + cikisTarihi +
                '}';
    }

    public void setseriNo(int seriNo) {

        this.seriNo=seriNo;

    }

   public String getyazarAdSoyad(){
        return yazarAdSoyad;
   }

    public int getCikisTarihi() {
        return cikisTarihi;
    }

    public int getseriNo(){
        return seriNo;
    }










}



