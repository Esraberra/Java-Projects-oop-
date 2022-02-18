package javaProblemsForAutomation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapv {

    public static void main(String[] args) {
        LinkedHashMap< Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(100,"Rajendra");
        map.put(101,"Vijay");
        map.put(102,"Technolamror");
        for (Map.Entry e:map.entrySet()
             ) {
            System.out.println(e.getKey()+" "+e.getValue());

        }



        }

}
