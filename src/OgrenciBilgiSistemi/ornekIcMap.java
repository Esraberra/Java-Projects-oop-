package OgrenciBilgiSistemi;

import java.util.HashMap;
import java.util.Scanner;

public class ornekIcMap {

    public static void main(String[] args) {


    HashMap< Integer, HashMap<String, String>> kayitBilgileri = new HashMap< >();
    HashMap<String, String> icMap=new HashMap<>();

    Scanner scan=new Scanner(System.in);

    //int kimlikNo= scan.nextInt();
        System.out.println("Lütfen isim giriniz");
        icMap.put("isim", scan.nextLine());

    //String isim=scan.nextLine();
        System.out.println("adres giriniz");

        icMap.put("Adres", scan.nextLine());
    //String adres=scan.nextLine();
        System.out.println("telefon giriniz");
    // String telefon=scan.nextLine();

        icMap.put("telefon", scan.nextLine());

        System.out.println("Lütfen 4 haneli kimlik numarasini giriniz");
        kayitBilgileri.put(scan.nextInt(), icMap );

        System.out.println("ilk yazdirdigi ic map " +icMap);
        System.out.println(kayitBilgileri);







}

}


