package OgrenciBilgiSistemi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ogrenci_islerinden_gelen_klas {
    static String username = "";
    static String password = "";
    static int no;
    static Map<String, String> usernameAndPasswords = new HashMap<>();
    static Map<Integer, String> ogrenciBilgileri = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ogrenciBilgileri.put(101, "Esra Buyuk");
        ogrenciBilgileri.put(102, "Ayse Kaplan");
        ogrenciBilgileri.put(103, "Fatma Kucuk");
        ogrenciBilgileri.put(104, "Hayriye Kocak");
        ogrenciBilgileri.put(105, "Su Mabeyn");
        usernameAndPasswords.put("esrabuyuk", "esra101");
        System.out.println("Lutfen kullanici adi ve sifrenizi giriniz");
        username = scan.nextLine();
        password = scan.nextLine();
        if (usernameAndPasswords.containsKey(username)) {
            if (usernameAndPasswords.get(username).equals(password)) {
                System.out.println("Basariyla giris yaptiniz");
            }
        } else {
            System.out.println("Kaydiniz bulunmamaktadir.Lutfen kayit olunuz");
            kullaniciAdiOlusturma();
        }
        menu();
    }

    private static void kullaniciAdiOlusturma() {
        System.out.println("Lutfen bir kullanici adi olusturunuz");
        username = scan.nextLine();
        System.out.println("Lutfen bir sifre olusturunuz");
        password = scan.nextLine();
        usernameAndPasswords.put(username, password);
        System.out.println("Kaydiniz basariyla olusturulmustur");
    }

    public static void menu() {
        int secim = 0;
        while (secim != 4) {
            System.out.println("Lütfen yapmak istediginiz islemi seciniz :" + "1-Ogrenci Kaydi 2-Ogrenci Bilgileri Görüntüleme 3-Ogrenci Silme 4-Cikis");
            secim = scan.nextInt();
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
                case 4:
                    System.out.println("Iyi gunler!");
                    break;
            }
        }
    }

    private static void ogrenciKaydi() {
        Map<Integer, String> ogrenciBilgileriKayitsiz = new HashMap<>();

        System.out.println("Lutfen ogrenci no giriniz");
        no = scan.nextInt();
        scan.nextLine();
        System.out.println("Lutfen isim soyisim not ort. giriniz");

        String isimSoyisimNot = scan.nextLine();
        ogrenciBilgileriKayitsiz.put(no, isimSoyisimNot);
        System.out.println("Ogrenci no , isim soyisim , not ort : " + ogrenciBilgileriKayitsiz);
        System.out.println("------>>>>Kaydiniz basariyla olusturulmustur.<<<<------");
        ogrenciBilgileri.put(no, isimSoyisimNot);
    }

    public static void ogrenciBilgileriGoruntuleme() {
        System.out.println("Lutfen ogrenci no giriniz");
        no = scan.nextInt();
        if (ogrenciBilgileri.containsKey(no)) {
            System.out.println("Sistemimize kayitlisiniz.Bilgileriniz asagidaki gibidir : \n" + ogrenciBilgileri.get(no));
        } else {
            System.out.println("Girilen numarada bir kayit bulunmamaktadir.\nLutfen ust menuden kayit islemlerinizi yapiniz");
        }
    }

    private static void ogrenciSilme() {
        System.out.println("Kaydini silmek istediginiz ogrencinin numarasini giriniz");
        no = scan.nextInt();
        ogrenciBilgileri.remove(no);
        System.out.println("Kaydiniz basariyla silinmistir");
    }

}
