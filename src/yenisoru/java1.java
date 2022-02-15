package yenisoru;

import java.util.Scanner;

public class java1 {


    public static void main(String[] args) {
//a =4, b=10

int a=10;
int b=4;

a=b;
b=a+a+a/2;

     //   System.out.println("a : "+ a+ " "+  "b : "+ b );

 String cümle ="Hey Java is good";

 String tersCümle="";

        for (int i = cümle.length()-1; i >=0 ; i--) {
          tersCümle=tersCümle+  cümle.substring(i, i+1);



        }
      //  System.out.println(tersCümle);


        StringBuilder str=new StringBuilder(cümle);
     //   System.out.println(str.reverse());


 //tek ve cift sayilari nasil yazdirirsin?
 Scanner scan=new Scanner(System.in);

        System.out.println("lütfen sayi giriniz");

 int sayi=scan.nextInt();

       String sonuc= sayi % 2 == 0 ? "cift sayi girdiniz":"tek sayi girdiniz";

        System.out.println(sonuc);





    }
}
