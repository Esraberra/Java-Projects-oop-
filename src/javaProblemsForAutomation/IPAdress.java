package javaProblemsForAutomation;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAdress {
    public static void main(String[] args) throws UnknownHostException {

        System.out.println(InetAddress.getLocalHost());

    }
}
class Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try { rs.exec("notepad");
        }
        catch (IOException e) {
            System.out.println(e); }
    } }