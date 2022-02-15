package javaProblemsForAutomation;

import java.sql.Date;

//How to SQL Date in java Program
public class StringToSQLDateExample {
    public static void main(String[] args) {
String str="2022-02-22";
        Date date =Date.valueOf(str);
        System.out.println(date);

    }
}
