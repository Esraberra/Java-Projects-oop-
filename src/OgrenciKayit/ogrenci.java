package OgrenciKayit;
//Ogrenci adinda bir class olusturun Ogrencinin numarasi, adi, soyadi
     //   ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
     //   getter ve setter methodlari olusturun default constructor ve tum degiskenleri
    //    iceren parametleri constructor olusturun

public class ogrenci {
    private int ogrenciNo;
    private String ogrenciAdSoyad;
    private double notOrt;
    private String kullaniciAdi;
    private String sifre;

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
public ogrenci( String kullaniciAdi,String sifre) {
    this.kullaniciAdi=kullaniciAdi;
    this.sifre=sifre;
}

    public double getNotOrt() {
        return notOrt;
    }

    public double setNotOrt(double notOrt) {
        this.notOrt = notOrt;
        return notOrt;
    }

    public String getOgrenciAdSoyad() {
        return ogrenciAdSoyad;
    }

    public String setOgrenciAdSoyad(String ogrenciAdSoyad) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        return ogrenciAdSoyad;
    }

    public ogrenci() {
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public ogrenci(int ogrenciNo, String ogrenciAdSoyad,double notOrt) {
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAdSoyad=ogrenciAdSoyad;
        this.notOrt=notOrt;
    }


    public int setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
        return ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci Bilgileri: {" +
                "Ogrenci No=" + ogrenciNo +
                ", Ögrenci Isim Soyisim='" + ogrenciAdSoyad + '\'' +
                ", Not Ortalamasi=" + notOrt +
                '}';
    }
}

