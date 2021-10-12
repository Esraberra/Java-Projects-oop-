package elifHocaOdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class h2 {
    static Scanner scan=new Scanner((System.in));




    //Problem Tanımı :
//Basit 4 işlem yapan bir hesap makinesi kodlayınız....
//Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
//Kullanicidan iki sayi girmesini isteyiniz.
//Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.^^
    public static void main(String[] args) {
        menu();

    }


    public static void menu() {

        System.out.println("Lütfen yapacaginiz islemi seciniz : 1-Toplama  2-Cikarma 3-Carpma 4-Bolme");
        int secim= scan.nextInt();

        if (secim==1){
            toplama();
        }else if (secim==2){
            cikarma();
        }else if (secim==3){
            carpma();
        }else if (secim==4){
            bolme();
        }

        else {
            System.out.println("lütfen hesaplama menüsünde yer alan  sayi giriniz");
            menu();
        }

    }

    private static void bolme() {
        System.out.println("bölme islemi icin birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        if (sayi2==0) {
            System.out.println("0!! disinda bir sayi giriniz!!");
            bolme();
        } else {
            System.out.println("islemin sonucu :"+ (sayi1/sayi2));
        }

    }

    private static void carpma() {
        System.out.println("carpma islemi icin birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("islemin sonucu :" + (sayi1*sayi2));
    }

    public static void cikarma() {
        System.out.println("cikram islemi icin birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("islemin sonucu :"+ (sayi1-sayi2));
    }


    public static void toplama() {

        System.out.println("toplama islemi icin birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        double sonuc=sayi1+sayi2;
        System.out.println("islemin sonucu :"+ (sonuc));
        System.out.println("toplamaya devam etmek istiyor musunuz ? :1-Evet 2- Hayir cikayim" );
        int secim=scan.nextInt();
        double toplam=0 ;

        if(secim==1) {
            List<Double> toplamlar=new ArrayList<>();
            System.out.println("sonuca eklemek istediginiz sayiyi giriniz");
            double sayiSon= scan.nextDouble();

      sonuc=toplam;
          toplam= sonuc+sayiSon;

            System.out.println("toplam :"+toplam);
            toplamlar.add(toplam);




        }else {
            menu();
        }








    }



}

