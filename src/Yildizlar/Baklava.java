package Yildizlar;

import java.util.Scanner;

public class Baklava {
    public static void main(String[] args) {









        int baslangic = 1;
        int bitis = 7;
        for(int i = baslangic; i<=bitis; i++) {
            for(int j = baslangic; j<i; j++) {
               j= j+2;
                System.out.print("*");
            }
            System.out.print("\n");

        }




    }

}
