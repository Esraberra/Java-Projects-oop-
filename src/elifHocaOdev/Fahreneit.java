package elifHocaOdev;

import java.util.Scanner;

public class Fahreneit {
   /* *****Gunun JavaScript sorusu **** cevabi yarin
    Girilen dereceyi fahrenayta veya fahrenaytı dereceye çeviren programı tasarlayınız. Çevirimin hangi birimden hangi birime olacağı program başında sorulmalıdır.
            c = (f-32)*5/9   //    fhr= drc*1.8  + 32 */

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("fahreneit tan dereceye cevirmek isitoyrsaniz (1)");
        System.out.println("dereceden fahrenayta cevirmek istiyorsaniz (2)");
        int secim=scan.nextInt();
        switch (secim) {

            case 1:
                fahrendenDereceye();
            break;
            case 2:
                derecedenFahreye();
                break;
        }


    }

    private static void derecedenFahreye() {
        System.out.println("degeri giriniz");
        double derece=scan.nextDouble();
       double fhrsonuc=(derece*1.8)+32;
        System.out.println("sonuc :" + fhrsonuc);
    }

    private static void fahrendenDereceye() {
        System.out.println("degeri giriniz");
        double fahre= scan.nextDouble();
        double dereceYeni=(fahre-32)*5/9;
        System.out.println("sonuc" + dereceYeni);
    }
}
