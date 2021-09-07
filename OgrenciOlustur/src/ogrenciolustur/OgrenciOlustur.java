package ogrenciolustur;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciOlustur
{

    private static ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
    public static Scanner scanner = new Scanner(System.in);

    public static void ogrenci_bastir()
    {
        System.out.println(ogrenciler.size() + " kadar ogrenci mevcudumuz vardir...");
        System.out.println("Ogrencilerimiz : ");
        for (int i = 0; i < ogrenciler.size(); i++)
        {
            System.out.println((i + 1) + ". Ogrenci: " + ogrenciler.get(i).getIsim());
        }

    }

    public static void ogrenci_ekle()
    {
        ogrenciler.add(new Ogrenci());
    }

    public static void ogrenci_sil()
    {
        System.out.println("Silmek istediginiz ogrencinin sirasini giriniz  : ");
        int sira = scanner.nextInt();
        scanner.nextLine();
        ogrenciler.remove(sira - 1);
        System.out.println(sira + "'daki ogrenciniz siliniyor...");
    }

    public static void islemler_bastir()
    {
        System.out.println("\tProgramdan cikmak icin q'ya basiniz.");
        System.out.println("\tOgrencileri listelemek icin 1'e basiniz.");
        System.out.println("\tOgrenci eklemek icin  2'ye basiniz.");
        System.out.println("\tOgrenci silmek icin  3'e basiniz.");
        System.out.println("\tOgrenci güncellemek icin 4'e basiniz.");
        System.out.println("\tOgrencinin detayli bilgisi icin 5'e basiniz.");
        System.out.println("\tOgrenciye ders eklemek icin 6'ya basiniz . ");
        System.out.println("\tOgrencinin dersini silmek icin 7'ye basiniz . ");
        System.out.println("\tOgrencinin derslerini goruntulemek icin 8'e basiniz . ");
                System.out.println("\tOgrencinin derslerini Guncellemek icin 9'a basiniz . ");


        System.out.println("\tIslemleri tekrar goruntulemek icin 0'a basiniz.");

    }

    public static void ogrenci_guncelle(int ind)
    {

        ogrenciler.set(ind - 1, new Ogrenci());
        System.out.println("Ogrenci Listemiz Guncellendi...");

    }

    public static void ogrenci_ders_bastir(int ind)
    {
        ogrenciler.get(ind).ders_bastir();

    }

    public static void ogrenci_ders_ekle(int ind)
    {
        ogrenciler.get(ind - 1).ders_ekle();
    }

    public static void ogrenci_ders_sil(int ind)
    {
        ogrenciler.get(ind - 1).ders_sil();
    }
    public static void ogrenci_ders_guncelle(int ind)
    {
        ogrenciler.get(ind-1).ders_guncelle();
        
    }

    public static void main(String[] args)
    {
        ogrenciler.add(0, new Ogrenci(1, "Mustafa Zaimoglu", "02180201066", "Bilgisayar Muhendisligi"));
        ogrenciler.add(1, new Ogrenci(1, "Ramazan Kahraman", "02180201064", "Bilgisayar Muhendisligi"));
        ogrenciler.add(2, new Ogrenci(1, "Busra Ertekin", "02190201024", "Bilgisayar Muhendisligi"));
        ogrenciler.add(3, new Ogrenci(1, "Demet Merve Ergulec", "02180201028", "Bilgisayar Muhendisligi"));
        ogrenciler.add(4, new Ogrenci(1, "Batuhan Tomo", "02180201020", "Bilgisayar Muhendisligi"));
        ogrenciler.add(5, new Ogrenci(1, "Musa Baytekin", "02180201001", "Bilgisayar Muhendisligi"));

        ogrenciler.get(1).dersler.add("Algoritma");
        ogrenciler.get(1).dersler.add("Genel Matematik 2");
        ogrenciler.get(1).dersler.add("Lineer Cebir");
        ogrenciler.get(1).dersler.add("Proje Planlama");
        

        //   ogrenciler.add(new Ogrenci(1, null, null, null)); nesne dizisi gibi
       
        islemler_bastir();
        while (true)
        {
            System.out.print("\tIslem giriniz : ");
            String islem = scanner.nextLine();
            if (islem.equalsIgnoreCase("q"))
            {
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equalsIgnoreCase("0"))
            {
                islemler_bastir();
            }
            else if (islem.equalsIgnoreCase("1"))
            {
                ogrenci_bastir();

            }
            else if (islem.equalsIgnoreCase("2"))
            {
                ogrenci_ekle();
            }

            else if (islem.equalsIgnoreCase("3"))
            {
                ogrenci_sil();
            }
            else if (islem.equalsIgnoreCase("4"))
            {
                System.out.println("Guncelleyeceginiz ogrencinin pozisyonunu giriniz : ");
                int sira = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Yeni Ogrencinin icin : ");
                ogrenci_guncelle(sira);

            }
            else if (islem.equalsIgnoreCase("5"))
            {
                System.out.println("Bilgisini almak istediginiz ogrencinin pozisyonunu giriniz : ");
                int position = scanner.nextInt();
                scanner.nextLine();
                ogrenciler.get(position - 1).bilgiVer();

            }
            else if (islem.equalsIgnoreCase("6"))
            {
                System.out.println("Ders eklenecek ogrencinin pozisyonunu giriniz : ");
                int sira = scanner.nextInt();
                scanner.nextLine();
                ogrenci_ders_ekle(sira);
            }
            else if (islem.equalsIgnoreCase("7"))
            {
                System.out.println("Dersi Silinecek ogrencinin pozisyonunu giriniz : ");
                int sira = scanner.nextInt();
                scanner.nextLine();
                ogrenci_ders_sil(sira);
            }
            else if (islem.equalsIgnoreCase("8"))
            {
                System.out.println("Dersi Bastirilicak ogrencinin pozisyonunu giriniz : ");
                int ind = scanner.nextInt();
                scanner.nextLine();
                ogrenci_ders_bastir(ind);

            }
            else if (islem.equalsIgnoreCase("9"))
            {
                System.out.println("Dersi Guncellenecek ogrencinin pozisyonunu giriniz : ");
                int ind = scanner.nextInt();
                scanner.nextLine();
                ogrenci_ders_guncelle(ind);

            }
            else
            {
                System.out.println("Yanlıs bir islem girdiniz ...");
            }

        }
  

    }

}
