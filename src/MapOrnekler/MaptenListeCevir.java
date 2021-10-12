package MapOrnekler;

import java.util.*;

public class MaptenListeCevir {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(101, "Ali,Can,jAva");
        map1.put(102, "Veli,Yan,java");  //keySet  //values
        map1.put(103, "Ali, Yan, C#");


List<String> yeniLinkd=new LinkedList<String>(map1.values());
        System.out.println(yeniLinkd.size());  //burasi liste cevirdi

LinkedList<String> yeni=new LinkedList<>(yeniLinkd); //ama burasi linkedliste cevirdi ve kolayca ayirim yazdirdim
        System.out.println(yeni.element().substring(0,3)+ " ve " +yeni.element().substring(4,8));


        List<Integer> list = new ArrayList<Integer>(map1.keySet());//1)
        System.out.println(list.size());




          List<String> valuelist=new ArrayList<String>(map1.values());
      // System.out.println(valuelist);

     //   System.out.println(Arrays.toString(new String[]{valuelist.get(1).substring(0, 4)}));

        // List<Map<Integer, String>> liste= Arrays.asList(map1); //direk mapin tamamini listeye cevirdi
      //  System.out.println(liste);

//mapteki Valueleri listeye cevirin;

List<String> list1=new ArrayList<>(map1.values()); //sette
     ;





    }













}
