package kutuphaneProject;
/*

         Kutuphane adinda bir class olusturun kitap kayit, kitap goruntuleme,
        kitap silme ve cikis methodlari olusturun bu methodlari main methodda cagirin.

        KitapBilgileri adinda bir class olusturun kitabin seri numarasi, adi, yazari
        ve cikis tarihi degiskenlerini private access modifier kullanarak olusturun
        getter ve setter methodlari olusturun default constructor ve tum degiskenleri
        iceren parametleri constructor olusturun*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static OgrenciBilgiSistemi.C02ogrenci_Olusturma.cikis;

public class kutuphane {
    static Scanner scan=new Scanner((System.in));
 static Map<Integer,kitapBilgileri> map=new HashMap<>();




    public void menu(){

int secim=0;
while(secim!=4) {


        System.out.println("Lütfen yapmak istedigniz islemi seciniz :"+ "1-Kitap Kaydi 2-Kitap Bilgileri Görüntüleme 3-kitap Silme 4-Cikis");

        secim= scan.nextInt();
        switch (secim) {

            case 1 :
                kitapKayit();
                break;
            case 2:
                kitapBilgiGoruntule();

                break;
            case 3:
                kitapSilme();
                break;
            case 4:
                cikis();
                break;

        }
}
}



    private static void kitapSilme() {
        System.out.println("Lütfen silmek istediginiz kitabin seri nosunu giriniz");
        int seriNo= scan.nextInt();
       if( map.containsKey(seriNo)) {
           map.remove(seriNo);

       }

    }

    private static void kitapBilgiGoruntule() {

        System.out.println("Lütfen görüntülemek istediginiz kitabin seri nosunu giriniz");

        int seriNo= scan.nextInt(); //actigim kitap seri no numarasini bana olusturdugum map listesinden getirmesini istedim.

if (map.containsKey(seriNo)) {
    System.out.println(map.get(seriNo));
} else {
    System.out.println("Bu seri numarasina ait kitap bulunmamaktadir");

}



    }

    public static void kitapKayit() {
        System.out.println("Lütfen kaydetmek istediginiz kitabin seri nosunu giriniz");
       int kitapSeriNo =scan.nextInt();

        System.out.println("Lütfen kaydetmek istediginiz kitabin adini giriniz");
        String kitapIsmi= scan.nextLine();
        scan.nextLine();
        System.out.println("Lütfen kaydetmek istediginiz kitabin yazar adini giriniz");
        String yazarAdi1= scan.nextLine();
        System.out.println("Lütfen kaydetmek istediginiz kitabin yayin tarihini giriniz");
        int yayinTarihi =scan.nextInt();

        kitapBilgileri obje=new kitapBilgileri(kitapIsmi,yazarAdi1,yayinTarihi);

//obje.setKitapIsmi(kitapAdi1);
//obje.setYazarAdSoyad(yazarAdi1);
//obje.setCikisTarihi(yayinTarihi);

map.put(kitapSeriNo,obje);// bir map olusturdum bunun icine kitap bilgileri kaydedilecek.obje ile girilen kitapAdi1 nin  kitap bilgileri klasinda olusan kitapismi olarak dönmesini sagladim

    }

public static void cikis(){
    System.out.println("Cikis yapiliyor. Katkiniz icin tesekkür ederiz");


}
}
