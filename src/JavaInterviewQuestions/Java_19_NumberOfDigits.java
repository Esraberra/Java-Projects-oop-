package JavaInterviewQuestions;

public class Java_19_NumberOfDigits {
    public static void main(String[] args) {

        int sayi=2345677;
        int sayac=0;

        while(sayi>0) {
            sayi/=10; sayac++;


        }
        System.out.println("sayi; " +sayac + " " +"basamaklidir");

    }
}
