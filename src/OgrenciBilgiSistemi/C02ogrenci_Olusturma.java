package OgrenciBilgiSistemi;

import java.util.HashMap;
import java.util.Scanner;

public class C02ogrenci_Olusturma extends C01_ogrenci {
// burada ögrenci kayit methodu
    //ögrenci görüntüleme methodu
    //ögrenci silme ve cikis methodlari olacak switch case ile
static HashMap<String,String> ogrenciNoVeIsim =new HashMap<>();
  static  HashMap<String,String> kullaniciAdiVeSifre =new HashMap<>();
static Scanner scan=new Scanner(System.in);
    static C01_ogrenci obje=new C01_ogrenci();

    public static void main(String[] args) {
      boolean cikisYapilsinMi=false;

        while(!cikisYapilsinMi) {
        System.out.println("Lütfen yapmak istedigniz islemi seciniz :"+ "1-Ogrenci Kaydi 2-Ogrenci Bilgileri Görüntüleme 3-Ogrenci Silme 4-Cikis");
   String olusturma = scan.nextLine();



 switch (olusturma){
    case "1":
        ogrenciKaydi();
            break;
    case   "2" :
        ogrenciBilgileriGoruntuleme();
         break;

    case "3" :
      ogrenciSilme();
      break;

    case "4":
        cikis();
        cikisYapilsinMi=true;
        break;

    default :
        break;
}
}





    }

    public static void cikis() {
        System.out.println("Cikis yapiliyor");

    }

    public static void ogrenciSilme() {
        System.out.println("Lütfen silmek istediginiz ögrencinin numarasini giriniz");
        String no=scan.nextLine();
        if (no==obje.getOgrenciNo()) {


        }
    }


    public static void ogrenciBilgileriGoruntuleme() {
        System.out.println("lütfen ögrenci numaranizi giriniz");
        String ogrenciNo = scan.nextLine();
        if (ogrenciNo.equals(ogrenciNoVeIsim)) {
            System.out.println("basardiniz");

        } else {
            System.out.println("numara ve sifrenizi tekrar deneyiniz");


        }
    }



    public static void ogrenciKaydi() {


        System.out.println("Lütfen ogrenci numaranizi giriniz");

        ogrenciNoVeIsim.put("ogrenci numarasi", scan.nextLine());
       ////////////////////////////
        System.out.println("Lütfen  isimi ve soyisim giriniz");
ogrenciNoVeIsim.put("Ogrenci Ad Soyad", scan.nextLine());

// <<<<<<<<<<<<<<-------------------->>>>>


        System.out.println("Lütfen bir kullanici adi giriniz");
kullaniciAdiVeSifre.put("Kullanici Adi", scan.nextLine());
/////////////////////////
        System.out.println("Lütfen bir sifre giriniz");
        kullaniciAdiVeSifre.put("Sifre", scan.nextLine());



        System.out.println("ögrenci bilgileriniz kaydedilmistir"+ " " + "Kullanici adi ve sifreniz :"+ kullaniciAdiVeSifre);
        System.out.print("");
        System.out.println("Ögrenci Bilgileri : " + " "+ ogrenciNoVeIsim);
    }


}
