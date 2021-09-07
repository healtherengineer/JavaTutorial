
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Basit Matematik ve Fizik Problemler
        // Daire Alan - Matematik
        // Üçgen Cevresi - Matematik
        // 3 Boyutlu Vektorlerin İç Çarpımı - Fizik

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("Matematik ve fizik Problemleri programına Hoş Geldiniz...");
        System.out.println("--------------------------------------------------------");

        String islemler = "1-Daire Alan hesaplama\n"
                + "2-Ucgen Cevresi hesaplama\n"
                + "3-Ic Carpım hesaplama \n"
                + "Çıkış icin q'ya basiniz ...";
        while (true)
        {
            System.out.println(islemler);
            System.out.print("İsleminizi giriniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("Programdan çikiliyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.print("Yaricap degerini giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap); // obje oluşturmadan nasıl kullandık 
                // çunku static inner class oldukları icin !!!
            }
            else if (islem.equals("2"))
            {
                System.out.println("Ücgenin cevresi icin : ");
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            }
            else if (islem.equals("3"))
            {
                Vec vec1 = new Vec("Vec1");
                Vec vec2 = new Vec("Vec2");

                Problem.Fizik.icCarpim(vec1, vec2);
            }
            else
            {
                System.out.println("Gecersiz islem...");
            }

        }
    }

}
