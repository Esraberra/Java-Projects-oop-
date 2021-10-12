package JavaInterviewQuestions;

import java.util.*;
import java.util.stream.Stream;

public class StringBuilder {


    private static Object Arrays;

    public static void main(String[] args) {

       String kelimem="ARSIDUK";
       String kelimem2="duk";
               String kelimem3="matmazel";


        /////////////////////////////////
        ////
        List<String> list=new ArrayList<String>();
        list.add(kelimem);
        list.add(kelimem2);
        list.add(kelimem3);

//listteki kelimelerin her birisi ters yazilmis halde tekrar listelensin



        list.stream().map(t->t.split(" ")).distinct().forEach(System.out::println);
    }
}
