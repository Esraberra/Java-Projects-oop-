package OgrenciKayit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ogrenciOlusturma {

    static Map<Integer, ogrenci> gelenOgrenciBilgileri = new HashMap<>();
     static int ogrenciNo1 = 103;
     static String adSoyad1 = "Tilki Nalan";
    static  double notOrt1 = 3.2;
    static String kullaniciAdi = "Tilki";
    static String sifre = "Tilki10";

    static  String adSoyad = "Esra Kücük";
    static  int ogrenciNo = 102;
    static double notOrt = 3.4;
    static  String kullaniciAdi1 = "Kücük";
    static  String sifre1 = "Esra10";
    static Scanner scan = new Scanner(System.in);
    static  ogrenci obje = new ogrenci(ogrenciNo1, adSoyad1, notOrt1);
    /////////////////////
    static  ogrenci st = new ogrenci(kullaniciAdi, sifre);
    static  ogrenci st1 = new ogrenci(kullaniciAdi1, sifre1);
    ////////////////////////
    static    ogrenci obje1 = new ogrenci(ogrenciNo, adSoyad, notOrt);
    public void menu() {

        int secim = 0;
        while (secim != 4) {


            System.out.println("lütfen secim yapiniz : 1_ kayit 2-ögrenci görüntüleme 3-ögrenci silme 4-cikis");

            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    kayit();
                    break;
                case 2:
                    ogrenciGoruntule();
                    break;
                case 3:
                    ogrenciSilme();
                    break;
                case 4:
                    cikis();
                    break;
            }
        }
    }


    private void cikis() {
        System.out.println("Cikis yapiliyor");
    }

    private void ogrenciSilme() {
        System.out.println("Silmek istediginiz ögrencinin numarasini giriniz");
        int no1 = scan.nextInt();
        if (gelenOgrenciBilgileri.containsKey(no1)) {
            gelenOgrenciBilgileri.remove(ogrenciNo);
            System.out.println("Bilgileriniz silinmistir");
            ogrenciGoruntule();
        } else {
            System.out.println("lütfen gecerli bir numara giriniz");
        }
    }

    private void ogrenciGoruntule() {
        System.out.println("Görüntülemek istediginiz ögrencinin numarasini giriniz");
        int no = scan.nextInt();

        if (gelenOgrenciBilgileri.containsKey(obje.getOgrenciNo())||
                gelenOgrenciBilgileri.containsKey(obje1.getOgrenciNo())
        ) {
            System.out.println("Ogrenci Bilgileri ");

            System.out.println(gelenOgrenciBilgileri.get(no));

        } else {
            System.out.println("ögrenci numarasini yanlis girdiniz");
            ogrenciGoruntule();
        }
    }


    public void kayit() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ögrenci numaranizi giriniz");
       int kayitOgrnciNo = scan.nextInt();
//gelenOgrenciBilgileri.put("Ögrenci No :", scan.nextInt());

        System.out.println("Lütfen isim ve soyisim giriniz");
        String AdSoyad = scan.nextLine();
//ogrenciAdVeSoyad.put("Ögrenci isim ve Soyisim ", scan.nextLine());
        scan.nextLine();
        System.out.println("Lütfen donem sonu not ortalamanizi giriniz");
        double notOrt = scan.nextDouble();
        //    isimVeNotOrt.put("Not Ortalamasi ", scan.nextDouble());
        ogrenci obje = new ogrenci(kayitOgrnciNo, AdSoyad, notOrt);
        obje.setOgrenciNo(kayitOgrnciNo);
        obje.setOgrenciAdSoyad(AdSoyad);
        obje.setNotOrt(notOrt);

        gelenOgrenciBilgileri.put(kayitOgrnciNo, obje);


        System.out.println("kaydedilen bilgileriniz ");
        System.out.println(gelenOgrenciBilgileri);

    }


    public void ogrenciKullanciAdiVeSifreOlusturma() {

        /////////////////////////
        st.setKullaniciAdi(kullaniciAdi);
        st.setSifre(sifre);
        /////////
        obje.setOgrenciAdSoyad(adSoyad1);
        obje.setOgrenciNo(ogrenciNo1);
        obje.setNotOrt(notOrt1);

        /////////////////////////////////////////
        obje1.setOgrenciAdSoyad(adSoyad);
        obje1.setOgrenciNo(ogrenciNo);
        obje1.setNotOrt(notOrt);
        st1.setKullaniciAdi(kullaniciAdi1);
        st1.setSifre(sifre1);
        ///////////
        gelenOgrenciBilgileri.put(1, obje);
        gelenOgrenciBilgileri.put(1, st);
        System.out.println("");
        gelenOgrenciBilgileri.put(2, obje1);
        gelenOgrenciBilgileri.put(2, st1);


        Map<String, String> kullaniciAdiveSifre = new HashMap<>();
        System.out.println(("Lütfen kullanici adinizi giriniz"));
        String alinanKullaniciAdi = scan.nextLine();

        System.out.println(("Lütfen sifrenizi giriniz"));
        String alinanSifre = scan.nextLine();
        kullaniciAdiveSifre.put(alinanKullaniciAdi, alinanSifre);
        if (kullaniciAdiveSifre.containsValue(st.getSifre()) ||
                kullaniciAdiveSifre.containsValue(st1.getSifre())) {
            System.out.println("basariyla giris yapitniz.. Menuye yönlendiriliyorsunuz");
            menu();
        } else {
            System.out.println("Hatali sifre girdiniz");
            ogrenciKullanciAdiVeSifreOlusturma();

        }


    }
}