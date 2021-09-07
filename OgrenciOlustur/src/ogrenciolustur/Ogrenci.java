package ogrenciolustur;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogrenci
{

    Scanner scanner = new Scanner(System.in);
    // atributes lerimiz 
    ArrayList<String> dersler = new ArrayList<String>();
    private int sinif;
    private String isim;
    private String okulNo;
    private String departman;
    private String id;

    public void ders_ekle()
    {
        System.out.println("Eklenecek dersi giriniz : ");
        String ders = scanner.nextLine();
        dersler.add(ders);
         System.out.println(isim+" adli ogrencinin Dersleri guncellendi ...");
    }

    public void ders_bastir()
    {
        for (int i = 0; i < dersler.size(); i++)
        {
            System.out.println(dersler.get(i));
        }
    }

    public void ders_sil()
    {
        ders_bastir();
        System.out.println("Silinecek dersin pozisyonunu giriniz : ");
        int pos = scanner.nextInt();
        dersler.remove(pos);
 System.out.println(isim+" adli ogrencinin Dersleri guncellendi ...");
    }

    public void ders_guncelle()
    {
        ders_bastir();
        System.out.println("Guncellenecek dersin pozisyonunu giriniz : ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni ders'i giriniz : ");
        String yeni = scanner.nextLine();
        dersler.set(pos - 1, yeni);
        System.out.println(isim+" adli ogrencinin Dersleri guncellendi ...");
    }

    //Actionlarımız
    public Ogrenci()
    {
        System.out.println("Ismini gir : ");
        this.isim = scanner.nextLine();
        System.out.println("Numarani gir : ");
        this.okulNo = scanner.nextLine();
        System.out.println("Departmanini gir : ");
        this.departman = scanner.nextLine();
        System.out.println("Sinifini gir : ");

        this.sinif = scanner.nextInt();
        scanner.nextLine();
    }

    public Ogrenci(int sinif, String isim, String okulNo, String departman)
    {
        this.sinif = sinif;
        this.isim = isim;
        this.okulNo = okulNo;
        this.departman = departman;

    }

    public void bilgiVer()
    {
        System.out.println("Ogrencinin Adi ve Soyadi : " + isim);
        System.out.println("Ogrencinin departmani    : " + departman);
        System.out.println("Ogrencinin Sinifi        : " + sinif);
        System.out.println("Ogrencinin Numarasi      : " + okulNo);
        System.out.println("Ogrencinin id'si           : " + getId());

    }

    public int getSinif()
    {
        return sinif;
    }

    public void setSinif(int sinif)
    {
        this.sinif = sinif;
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getOkulNo()
    {
        return okulNo;
    }

    public void setOkulNo(String okulNo)
    {
        this.okulNo = okulNo;
    }

    public String getDepartman()
    {
        return departman;
    }

    public void setDepartman(String departman)
    {
        this.departman = departman;
    }

    public String getId()
    {
        return departman.substring(0, 3) + okulNo.substring(0, 2);
    }

}
