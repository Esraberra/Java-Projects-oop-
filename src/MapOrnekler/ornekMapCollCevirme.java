package MapOrnekler;

import java.util.*;

public class ornekMapCollCevirme {
/*
map bir listem var bunu collactiona cevir oradan da hem Array liste hem liste cevirecem
 */


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
// map i array e cevirme
        map.values();

        Collection<String> coll = map.values(); // önce collection a cevirdim
       System.out.println(coll);
/////////////////////////////////////////

        System.out.println(coll.toArray().length); //coll ile direk iclerine girecek methodlara ulasamiyorum.
LinkedList<String> list5=new LinkedList<String>(coll);
        System.out.println(list5);
        System.out.println(list5.getFirst().concat(" K"));
//collectiondan da Array e cevir
        String[] arr = coll.toArray(coll.toArray(new String[0]));

        //yukarda string tipte bir arraye cevirdik
        List<String> arrdenListe = Arrays.asList(arr);

        System.out.println(arrdenListe);





    }
}