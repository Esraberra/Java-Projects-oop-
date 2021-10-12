package oguzhanOgrenciBilgiSistemi;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciOlusturma {
     /*
​
1 - Bir Ogrenci giris sistemi olusturun. Once kullanici adi ve sifre girmesini isteyin
Sistemde kayitli degilse uyelik olusturma menusune yonlendirin. Olusturukdan sonra giris sayfasina donsun
Eger basarili bir sekilde giris yaparsa OgrenciOlusturma menusune gonderin
​
3 - OgrenciOlusturma adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
ogrenci silme ve cikis methodlari olusturun bu methodlari switch case ile cagirin.
​
     */

    static Scanner scan = new Scanner(System.in);
    static HashMap<String, String> kullanicilar = new HashMap<>();
    static HashMap <String, Ogrenci> ogrenciler = new HashMap<>();


    public static void main(String[] args) throws InterruptedException {



        System.out.println("\nOgrenci giris sistemine hos geldiniz! \nLutfen 'Kullanici Adi' ve 'Sifre'nizi giriniz.");
        String islem = "";

        do {
            System.out.println("Kullanici Adi: ");
            String kullaniciAdi = scan.nextLine();
            System.out.println("Sifre: ");
            String sifre = scan.nextLine();
            boolean sifreKontrol = false;

            boolean kullanici = kullanicilar.keySet().contains(kullaniciAdi);

            if (kullanici) {
                sifreKontrol = kullanicilar.get(kullaniciAdi).equals(sifre);
            }

            if (!kullanici) {

                System.out.println("Boyle bir kullanici bulunamadi. Uyelik olusturma menusune yonlendiriliyorsunuz.");
                Thread.sleep(2000);
                uyelikOlusturma();


            } else if (!sifreKontrol) {

                System.out.println("Girdiginiz sifre hatali lutfen tekrar deneyin");
            }else {

                System.out.println("Basariyla giris yaptiniz.");
                Thread.sleep(2000);
                islem = ogrenciOlusturma();
            }


        }while(!islem.equals("5"));

    }

    private static void uyelikOlusturma() throws InterruptedException {

        System.out.println("\nLutfen kullanmak istediginiz kullanici adini giriniz: ");
        String kullaniciAdi = scan.nextLine();
        System.out.println("Lutfen bir sifre giriniz: ");
        String sifre = scan.nextLine();
        kullanicilar.put(kullaniciAdi,sifre);
        System.out.println("Uyeliginiz basariyla olusturuldu!");
        System.out.println("Bir ust menuye yonlendiriliyorsunuz.");
        Thread.sleep(2000);
        main(null);
    }

    private static String ogrenciOlusturma() {

        System.out.println("Ogrenci olusturma sistmeine hos geldiniz! Lutfen yapmak istediginiz islemi secin.");
        String islem = "";

        do {

            System.out.println("1- Ogrenci Kayit \n2- Ogrenci Goruntuleme\n3- Ogrenci Silme\n4- Tum Ogrencileri Listele\n5- Cikis");
            islem = scan.nextLine().substring(0,1);

            switch (islem) {

                case ("1"):
                    ogrenciKayit();
                    break;

                case ("2"):
                    ogrenciGoruntuleme();
                    break;
                case ("3"):
                    ogrenciSilme();
                    break;
                case ("4"):
                    ogrencileriListele();
                    break;
                case ("5"):
                    break;
                default:
                    System.out.println("Lutfen size sunulan seceneklerden birini secin!");

            }

        }while(!islem.equals("5"));

        return islem;
    }

    private static void ogrencileriListele() {

        System.out.printf("%-20s%-15s%-15s%s%n", "Ogrenci Numara","Ad","Soyad","Ortalama");
        System.out.println("-------------------------------------------------------------");

        for (Map.Entry<String, Ogrenci> w : ogrenciler.entrySet()) {



        }
        System.out.println("\n");

    }

    private static void ogrenciSilme() {

        System.out.println("Lutfen silmek istediginiz ogrencinin numarasini giriniz: ");
        String numara = scan.nextLine();

        System.out.println(ogrenciler.remove(numara));
        System.out.println("Ogrenci basariyla silindi!");
    }

    private static void ogrenciGoruntuleme() {

        System.out.println("Gorutulemek istediginiz ogrencinin numarasini giriniz: ");
        String numara = scan.nextLine();

        System.out.printf("%-20s%-15s%-15s%s%n", "Ogrenci Numara","Ad","Soyad","Ortalama");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%d%n", ogrenciler.get(numara).getOgrenciNo(),ogrenciler.get(numara).getAd(),ogrenciler.get(numara).getSoyad(),ogrenciler.get(numara).getOrt());
        System.out.println("\n");

    }
    private static void ogrenciKayit() {
        String islem = "";
        do {
            System.out.println("Ogrenci Kayit");
            System.out.println("-------------");
            System.out.println("Lutfen ogrencinin adini giriniz: ");
            String ad = scan.nextLine();
            System.out.println("Lutfen ogrencinin soyadini giriniz: ");
            String soyad = scan.nextLine();
            System.out.println("Lutfen ogrencinin ortalamasini giriniz: ");
            Integer ort = scan.nextInt();
            scan.nextLine();
            LocalDate ld = LocalDate.now();
            int yil = ld.getYear();


            Ogrenci kayit = new Ogrenci(ad, soyad, ort, yil);
            ogrenciler.put(kayit.getOgrenciNo(),kayit);
            System.out.println(kayit + "\nBilgiler basariyla eklendi!");

            System.out.println("Ogrenci kayit islemine devam istiyorsaniz 'E' istemiyorsaniz 'ENTER' basiniz");
            islem = scan.nextLine();

        }while(!islem.equals(""));


    }

}








