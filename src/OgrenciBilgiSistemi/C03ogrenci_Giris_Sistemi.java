package OgrenciBilgiSistemi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C03ogrenci_Giris_Sistemi extends C02ogrenci_Olusturma {
static Scanner scan= new Scanner(System.in);

    //buradan üye ögrenci kullanici ve sifre adini girerek siteye girecek

//sistemde kayitli degilse ogrenci olusturma menusune yönlendireegim
public static void main(String[] args) {
    Map<String, String> kullaniciAdiveSifre= new HashMap<>();
    C02ogrenci_Olusturma nesne =new C02ogrenci_Olusturma();

    System.out.println("lütfen kullanici adinizi ve sifrenizi giriniz");
    String kullaniciAdi=scan.nextLine();
    String sifre= scan.next();

    kullaniciAdiveSifre.put(kullaniciAdi,sifre);

    if (kullaniciAdiveSifre.containsKey(kullaniciAdi)) {

        if (kullaniciAdiveSifre.get(kullaniciAdi).equals(sifre)) {

            System.out.println("Basariyla giris yaptiniz");
        }

    } else {
        System.out.println("sisteme üye degilsiniz.. üye olma menüsüne yönlendiriliyorsunuz");

        ogrenciKaydi();


}






}

    public static void uyeOlma() {



    }
    }
