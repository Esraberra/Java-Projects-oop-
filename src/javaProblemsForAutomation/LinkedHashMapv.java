package javaProblemsForAutomation;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapv {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Rajendra");
        hm.put(101, "Lamror");
        hm.put(102, "Technolamror");
        System.out.println(hm);

        for (Map.Entry m : hm.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());

            {

            }

        }
    }
}
