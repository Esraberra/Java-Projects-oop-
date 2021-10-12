package UdemyOyun;

import java.util.Scanner;

public class GuessGame {
    public void LetsGuess(int sayi) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Tahmin girisiminiz maksimum 5'tir.");
        int tahmin = 0;
        for (int i = 0; i < 5; i++) {
            tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.println("Your number is too high");
            } else if (tahmin < sayi) {
                System.out.println("Your number is too low");
            } else if (tahmin == sayi) {
                System.out.println("You got it !!");
                break;
            }
        }
        if (tahmin != sayi) {
            System.out.println("Anlamadim dostum !!!");
        }
    }
    public int randomGenerator() {
        int rsayi = (int) (Math.random() * ((100 - 0) + 1)) + 0;
        return rsayi;
    }
}








