package javaProblemsForAutomation;

import java.util.Arrays;
import java.util.HashMap;

public class StringMapQuestion {

/*
private static HashMap<String,Integer> kacHarf(String harfSayisiBul) {
HashMap<String,Integer> map=new HashMap<>();
        String arr[]=harfSayisiBul.split("");
        System.out.println(Arrays.asList(arr));

        for (String e:arr
             ) {
            if (!map.containsKey(e)){
                map.put(e,1);
            }else {
                map.put(e,map.get(e)+1);
            }

        }
        return map;
        }
 */
 

    public static void main(String[] args) {
        //Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return
               // eden bir method yaziniz

        System.out.println(kacHarf("Vallee"));
    }

    private static HashMap<String,Integer> kacHarf(String kelime) {

        HashMap<String, Integer> map=new HashMap<>();

        String arr[]=kelime.split("");
        for (String w:arr
             ) {
            if (!map.containsKey(w)) {
                map.put(w,1);


            }else{
                map.put(w,map.get(w)+1);
            }

        }

       return map ;
    }


    //output ;{ V=1, A=1, L=2, E=3}



    }

