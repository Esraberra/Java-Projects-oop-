package OgrenciBilgiSistemi;

import java.util.HashMap;

public class C01_ogrenci {
 private String ogreciAdiVeSoyadi;
 private String ogrenciNo;
 private double notOrt;



             HashMap<String, String> ogrenciDatasi=new HashMap<String, String>() ;



    public C01_ogrenci() {
    }

    public C01_ogrenci(double notOrt) {

        this.notOrt = notOrt;
    }


    public C01_ogrenci(String ogreciAdiVeSoyadi) {

        this.ogreciAdiVeSoyadi = ogreciAdiVeSoyadi;
    }

    public void getNotOrt() {

       
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgreciAdiVeSoyadi() {
        return ogreciAdiVeSoyadi;
    }

    public void setOgreciAdiVeSoyadi(String ogreciAdiVeSoyadi) {
        this.ogreciAdiVeSoyadi = ogreciAdiVeSoyadi;
    }
}
