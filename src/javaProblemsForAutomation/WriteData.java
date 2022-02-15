package javaProblemsForAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("src/datalar");

   fout.write(33+77);
   fout.close();
            System.out.println("success.. by Technolamror.");
    }
        catch (Exception e){
            System.out.println(e);
        }

        }
}

//How to read data from text file using java
//program
class ReadData{
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("src/datalar");
        int i=fin.read();
        System.out.println((char)i);
        fin.close();
    }
        }
