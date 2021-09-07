
import java.util.Scanner;

public class Test
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler...\n"
                + "Kare'nin alani icin -> 1'e basiniz\n"
                + "Ucgen'nin alani icin ->2'e basiniz\n"
                + "Daire'nin alani icin ->3'e basiniz\n"
                + "Çıkmak icin --> q'ya basiniz ....";
        while (true)
        {
            Sekil sekil = null; // yolcu da  da böyle yapabilirdik!!!:..
            System.out.println(islemler);
            System.out.println("Alanini hesaplamak istediginiz Seklin turunu giriniz : ");

            String sekil_turu = scanner.nextLine();

            if (sekil_turu.equals("q"))
            {
                System.out.println("Programdan cikiliyor... Tesekkür ederiz.");
                break;
            }
            else if (sekil_turu.equals("1"))
            {
                System.out.println("Kare'nin kenar uzunlugunu giriniz : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare 1", kenar);
                sekil.alanHesapla();

            }
            else if (sekil_turu.equals("2"))
            {
                System.out.println("Ucgen icin ;");
                System.out.println("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                sekil.alanHesapla();
            }
            else if (sekil_turu.equals("3"))
            {
                System.out.println("Daire'nin yaricapini giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire 1", yaricap);
                sekil.alanHesapla();

            }
            else
            {
                System.out.println("Gecersiz islem...");
            }

        }

    }
}
