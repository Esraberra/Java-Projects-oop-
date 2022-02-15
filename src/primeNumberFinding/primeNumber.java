package primeNumberFinding;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
//sadece kendisine ve 1 e tam bölünmelidir

//number is divisible by other numbers
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        int flag = 0;


        for (int i = 2; i < sayi; i++) {

            if (sayi%i == 0) {
                flag++;

            }
            if (flag == 0) {
                System.out.println("prime number");


            }else {
                System.out.println("is not prime number");
            }

        }

    }
}
