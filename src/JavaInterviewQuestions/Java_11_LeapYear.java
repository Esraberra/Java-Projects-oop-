package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_11_LeapYear {
    public static void main(String[] args) {

/* 1. kural 4 ün kati olacak
2.kural 100 e bölünecek bu iki sarti saglayanlar

400 e de bölünecek
 */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir yil giriniz");
        int yil = scan.nextInt();


if (yil%4==0) {

    if(yil%100==0) {

         if ( yil%400==0){
            System.out.println("artik yildir");

        } else {
            System.out.println("artik yil degildir");
        }
    }

}

else{
    System.out.println("artik yil degildir");

}



    }

}
