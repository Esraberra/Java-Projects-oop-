package javaProblemsForAutomation;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
   TreeMap<Integer, String> hm=new TreeMap<>();
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Technolamror");
        for (Map.Entry e:hm.entrySet()
             ) {
            System.out.println(e.getKey()+ " "+e.getValue());

        }


    }
}
