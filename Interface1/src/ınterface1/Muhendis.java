package ınterface1;

public abstract class Muhendis
{

    String ad;
    String soyad;

    public Muhendis(String ad, String soyad)
    {
        this.ad = ad;
        this.soyad = soyad;
    }
    public void bilgi()
    {
        System.out.println("ADI : " + ad);
        System.out.println("SOYADI : " + soyad);
    }

}
