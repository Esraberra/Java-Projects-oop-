package javaProblemsForAutomation;

public class StringToIntExample {
    public static void main(String[] args) {
        String word="200";
        int sayi=Integer.parseInt(word);
        System.out.println(sayi);
        System.out.println(word+100);//200100 because + is string concatenation operator System.out.println(i+100);//300 because + is binary plus operator
    }
}
