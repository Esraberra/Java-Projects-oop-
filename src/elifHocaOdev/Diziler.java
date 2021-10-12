package elifHocaOdev;

import java.util.*;



public class Diziler {
    //kullanıcıdan 5 elemanlı bir dizi oluşturup tek
    //elemanları 0 ile çift elemanları 1 değiştirip yazdıran bir method yazınız.

    //13457-->00100
    public static void main(String[] args) {
        int[] dizi= new int[5];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("lütfen sirasiyla sayilari giriniz");
            dizi[i]=scn.nextInt();
        }
        System.out.println("Once :" + Arrays.toString(dizi));
        System.out.println("Sonra :" + Arrays.toString(teklere0Ciftlere1Ata(dizi)));


















}

    private static int[] teklere0Ciftlere1Ata(int[] dizi) {
        // eger dizinin elemani tek ise 0  cift ise 1 ataniyor
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] %2==1) {
                dizi[i]=0;
            }
            else dizi[i]=1;
        }



        return dizi;
    }
}