package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_07_CheckNumberEvenOrOdd {
    public static void main(String[] args) {
        // question even or odd  number

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0) {
            System.out.println("girmis oldugunuz sayi cifttir");
        } else if (sayi%2==1) {
            System.out.println("girmis oldgunuz sayi tektir");
        } else {
            System.out.println("lütfen gecerli bir sayi giriniz");
        }











    }
}
