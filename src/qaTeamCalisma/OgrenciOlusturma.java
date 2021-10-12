package qaTeamCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OgrenciOlusturma {
   static Scanner scan=new Scanner(System.in);
    static Ogrenci ogr1= new Ogrenci("100","sum","buy",3.85);
   static List<Ogrenci> ögrenciListesi= new ArrayList<>();

    public static void setÖgrenciListesi(List<Ogrenci> ögrenciListesi) {
        ögrenciListesi.add( new Ogrenci("102", "Esra", "Kücük",3.85));
        ögrenciListesi.add(new Ogrenci("104", "Hatice", "Dön", 3.2));
        ögrenciListesi.add(ogr1);
        OgrenciOlusturma.ögrenciListesi = ögrenciListesi;
    }

    public List<Ogrenci> getÖgrenciListesi() {

        return ögrenciListesi;
    }

    public static void main(String[] args) {
//      OgrenciOlusturma adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
//      ogrenci silme ve cikis methodlari olusturun bu methodlari switch case ile cagirin.


setÖgrenciListesi(ögrenciListesi);

        System.out.println(ögrenciListesi );

        System.out.println("yapmak istediginiz islemin nosunu giriniz");
        int num=scan.nextInt();
        switch(num) {
            case 1:
                ogrenciKayit();
                break;
            case 2:
                ogrenciGoruntuleme();
                break;
            case 3:
                ogrenciSilme();
                break;
            case 4:
                cıkıs();
                break;


        }

    }

    private static void ogrenciKayit() {
    }

    private static void cıkıs() {

    }
    private static void ogrenciSilme() {

    }
    private static void ogrenciGoruntuleme() {
        System.out.println("bilgilerini görüntülemek icin ögrenci no giriniz");
        String numara=scan.next();

       List<Ogrenci> yeni=     ögrenciListesi.stream().filter(t->t.getNo().equals(numara)).collect(Collectors.toList());
       yeni.stream().forEach(t-> System.out.println(t.toString()));
        //System.out.println(yeni.toString()); alternatif yazdirma sekli
            //System.out.println("ögrenci numarasi : " + ögrenciListesi.get(0).getNo());
           // System.out.println("ögrenci bilgileri :" + ögrenciListesi.get(0).getAd()+ ögrenciListesi.get(0).getSoyAd()+ögrenciListesi.get(0).getOrt());




    }

}
