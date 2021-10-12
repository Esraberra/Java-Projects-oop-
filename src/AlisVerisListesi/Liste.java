package AlisVerisListesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liste {
/*Alisveris Listesinde kac eleman olacak?
*Alis veris listesni olusturunuz
*Market listesini yazdiriniz
* Hangi elemani degistirmek istiyorsunuz?
*Listeye hangi elemani eklemek istiyorsunuz?
*Listenin Son halini gösteriniz
*
*
* */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Alisveris Listesinde kac eleman olacak ?");
      int  listeEleman=scan.nextInt();
        List<String> alisVerisList=new ArrayList<>();



        System.out.println("Alis veris listesni olusturunuz");
        for (int i = 0; i < listeEleman; i++) {
            alisVerisList.add(scan.nextLine());
        }System.out.println("Market Listeniz :  ");

        for (int j = 0; j < listeEleman; j++) {
            System.out.print(alisVerisList.get(j));
        }




        System.out.println("Hangi elemani degistirmek istiyorsnuz?");

        int kacinciEleman= scan.nextInt();
        System.out.println("yerine ne koyacaksiniz");

        String yiyecekler2= scan.next();

         alisVerisList.add(kacinciEleman-1,yiyecekler2);

        System.out.println( "yeni listeniz");
        for (int i = 0; i < alisVerisList.size(); i++) {
            System.out.println(alisVerisList.get(i));

        }






    }
}
