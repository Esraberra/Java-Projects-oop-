package JavaInterviewQuestions;

public class nn {

    public static void main(String[] args) {

        // bu sayinin rakamlari toplami nedir ?

      int sayi= 456;
int toplam=0;


     while (sayi!=0) {

       toplam = toplam+(sayi%10);
sayi/=10;

     }
        System.out.println(toplam);
    }
}
