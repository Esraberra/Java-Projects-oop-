package Ogrenci_Isleri;

import OgrenciBilgiSistemi.C01_ogrenci;

import java.util.*;

import static OgrenciBilgiSistemi.C02ogrenci_Olusturma.*;

public class ogrenciOlusturma {
// Bir Ogrenci giris sistemi olusturun. Once kullanici adi ve sifre girmesini isteyin
    //Sistemde kayitli degilse uyelik olusturma menusune yonlendirin. Olusturukdan sonra giris sayfasina donsun
    //Eger basarili bir sekilde giris yaparsa OgrenciOlusturma menusune gonderin



    // OgrenciOlusturma adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
   // ogrenci silme ve cikis methodlari olusturun bu methodlari switch case ile cagirin.
    static Scanner scan=new Scanner(System.in);
    static ogrenci obje=new ogrenci();
  static  List<String> ogrenciListesiAd=new ArrayList<>();
   static List<Integer> ogrenciListesi2No=new ArrayList<>();
static List<Double> ogrenciListesiNotOrt=new ArrayList<>();
    static Map <Integer,String> ogrenciBilgileri = new HashMap<>();

      static  public void menu() {


int secim=0;

while(secim!=4) {

    System.out.println("Lütfen yapmak istedigniz islemi seciniz :"+ "1-Ogrenci Kaydi 2-Ogrenci Bilgileri Görüntüleme 3-Ogrenci Silme 4-Cikis");
    secim= scan.nextInt();
switch (secim) {

    case 1:
        ogrenciKaydi();
        break;
    case 2:
          ogrenciBilgileriGoruntuleme();
        break;
    case 3:
            ogrenciSilme();
    break;
    case 4 :
        cikis();

    break;


}


}
        }















    public static void ogrenciKaydi()  {
        Map <Integer,String> ogrenciBilgileriKayitsiz = new HashMap<>();

        System.out.println("Lutfen isim soyisim giriniz");
            ogrenciBilgileriKayitsiz.put(scan.nextInt(),scan.nextLine());
            scan.nextLine();


            System.out.println("Ogrenci no , isim soyisim , not ort : "  );

            System.out.println("------>>>>Kaydiniz basariyla olusturulmustur.<<<<------");

        }
    public static void main(String[] args) {
        menu();

           }




    public static void ogrenciBilgileriGoruntuleme() {
        System.out.println("Sistemimize kayitlisini bilgileriniz asagidaki gibidir :");
        System.out.println();
      ogrenciBilgileri.put(101, "Esra Buyuk");
      ogrenciBilgileri.put(102, "Ayse Kaplan");
      ogrenciBilgileri.put(103, "Fatma Kucuk");
        ogrenciBilgileri.put(104, "Hayriye Kocak");
        ogrenciBilgileri.put(105, "Su Mabeyn");


        System.out.println(ogrenciBilgileri);



    }










    private static void ogrenciSilme() {
    }



    private static void cikis() {
    }


}
