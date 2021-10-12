package AlisVerisListesi;

import java.util.ArrayList;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner klavye=new Scanner(System.in);

        System.out.println("Alışveriş Listesi Kaç Elemandan Oluşacak ?");
        int n=klavye.nextInt();

        ArrayList<String> alinacaklar=new ArrayList<String>();
        System.out.println("Alışveriş Listesini Oluşturunuz : ");
        for(int i=0;i<n;i++){
            alinacaklar.add(klavye.next());
        } System.out.println("Market Listesi : ");
        for(int j=0;j<n;j++){
            System.out.println(alinacaklar.get(j));
        }

        System.out.println("Hangi Elemanı Değiştirmek İstiyorsunuz ?");
        int ara=klavye.nextInt();
        System.out.println("Listeye Hangi Malzemeyi Eklemek İstiyorsunuz ?");
        String eleman=klavye.next();

        alinacaklar.add(ara-1,eleman);

        System.out.println("Listenin Son Hali :");
        for(int k=0;k<alinacaklar.size();k++){
            System.out.println(alinacaklar.get(k));
        }





    }

}