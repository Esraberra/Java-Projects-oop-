package gruplaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class proje02 {
    /*saveInfo()
    kullanıcıdan birçok kimlik numarası isim adres ve telefon alin.
     kimlik numarasını key olarak, diğer bilgileri value olarak bir map edopolayin.
      ayni kimlik numarası ile ilgili bilgi girilmesini engelleyin.
      getInfo kimlik numarasını girerek  kullanıcının bilgilerine ulaşın olmayan kimlik numarası
      olmayan kimlik numarası girilirse kullanıcıya hata mesajı verim. durduruna kadar kullaniciya ulasmak istesin
      removeInfo()
    kimlik numarasını girerek data silin.
    Girilen  kimlik numarası yoksa kullaniciya hata mesajı verin
    Collection boş ise kullanıcıya hata mesajı verin
    selectOption method olusturun
    yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
    durana kadar sürekli kimlik bilgisi alin.
    */

    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        selectOption(hm);
    }
    /*saveInfo methodu olusturun:
    kullanıcıdan bircok kimlik numarası(4 haneli), isim,adrs, ve telefon alın.
    kimlik numarasını key olarak diger bilgileri value olarak bir map a depolayın
    aynı kimlik numrası ile bilgi girilmesine engel olun
    durana kadar surekli kimlik bilgisi alın*/
    public static void saveInfo(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("kimlik numaranizi girin");
            System.out.println("kimlik bilgisi almayi durdurmk icin 'Q' basınız");
            String id = scan.next();
            if (id.equalsIgnoreCase("Q")) {
                break;
            } else {
                while (hm.containsKey(id)) {
                    System.out.println(id + " giridiginiz aynı daha once kullanılmıs lutfen baska bir id giriniz");
                    id = scan.next();
                }
            }
            scan.nextLine();
            System.out.println("lutfen isminizi griniz");
            String isim = scan.nextLine();
            System.out.println("lutfen adresiniizi giriniz");
            String adres = scan.nextLine();
            System.out.println("lutfen telefon numaaranızı giriniz");
            String tel = scan.nextLine();
            String ogrenci = "\nIsim: " + isim + "\nAdres " + adres + "\nTelefon: " + tel;
            hm.put(id, ogrenci);
        } while (true);
        System.out.println(hm);
    }
    /* getInfo methodunu olusturun
     kimlik numarasını girerek kullanıcının bilgilerine ulasın
     olmayan kimlik numarası girilirse kullanıcıya hata mesajı verin
     durdurana kadar kullanıcı bilgiisine ulasmak istesin*/
    public static void getInfo(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        String id = "";
        do {
            System.out.println("lutfen bilgisini gormk istedıgınız ogrencnini  kimlik numarsını giriniz");
            System.out.println("bilgi almayı durdurmak durdurmk icin 'Q' basınız");
            id = scan.next();
            if (id.equalsIgnoreCase("Q")) {
                break;
            } else if (!hm.containsKey(id)) {
                System.out.println(id + "gecersiz id. lutfen gecerli bir id giriniz");
            } else {
                String ogrenciBilgi = hm.get(id);
                System.out.println(id + " bu id ye sahip olan ogrenin bilgileri bu sekildedir : \n" + ogrenciBilgi);
            }
        } while (true);
    }
    /*  removeInfo method olusturun
      kimlik numarasını girerek data silin
      girilen kimlik numarası yoksa kullanıcıya hata mesajı verin
      druruncaya kadar simlmeye devam etsin
      collection bos ise kullanıcıya hata mesajı verin*/
    public static void removeInfo(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("lutfen bilgilerin silmek istedıgınız ogrencninin  kimlik numarsını giriniz");
            System.out.println("silme islemini durdurmak durdurmk icin 'Q' basınız");
            String id = scan.next();
            if (id.equalsIgnoreCase("Q")) {
                break;
            } else if (hm.isEmpty()) {
                System.out.println("herhangi bir data yok");
            } else if (!hm.containsKey(id)) {
                System.out.println(id + "gecersiz id. lutfen gecerli bir id giriniz");
            } else {
                String silinenData = hm.remove(id);
                System.out.println(id + " bu id ye ait ogrenci bilgisi silinmisitir: \n" + silinenData);
            }
        } while (true);
        System.out.println(hm);
    }
    /*  selectOption method olusuturun
      yukarudakı 3 methodu programı sonlandırana kadar secme hakkı verin
   */
    public static void selectOption(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        String option="";
        do {
            System.out.println("hangi methodda calismak istiyorusnuz (1,2,3)");
            System.out.println("1: ogrenci ekle\n2: ogrenci bilgisi alma\n3: ogrenci kaydi silme");
            System.out.println("islemidurdurmak durdurmk icin 'Q' basınız");
            option = scan.next();
            if (option.equalsIgnoreCase("Q")) {
                break;
            }
            switch (option) {
                case "1":
                    saveInfo(hm);
                    break;
                case "2":
                    getInfo(hm);
                    break;
                case "3":
                    removeInfo(hm);
                    break;
                default:
                    System.out.println("gecerli bir numara giriniz");
            }
        } while (true);
    }
}









