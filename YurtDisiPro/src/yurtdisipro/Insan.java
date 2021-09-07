package yurtdisipro;

import java.util.Scanner;

public abstract class Insan 
{

    private String ad;
    private String soyad;
    private String vatandaslik;
    private int yas;

    public Insan()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Isminizi giriniz : ");
        this.ad = scanner.nextLine();
        System.out.println("Soyisminizi giriniz : ");
        this.soyad = scanner.nextLine();
        System.out.println("Yasinizi giriniz : ");
        this.yas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Vatandasi oldugunuz ülkeyi giriniz : ");
        this.vatandaslik = scanner.nextLine();

    }

    public String getAd()
    {
        return ad;
    }

    public void setAd(String ad)
    {
        this.ad = ad;
    }

    public String getSoyad()
    {
        return soyad;
    }

    public void setSoyad(String soyad)
    {
        this.soyad = soyad;
    }

    public String getVatandaslik()
    {
        return vatandaslik;
    }

    public void setVatandaslik(String vatandaslik)
    {
        this.vatandaslik = vatandaslik;
    }

    public int getYas()
    {
        return yas;
    }

    public void setYas(int yas)
    {
        this.yas = yas;
    }

}
