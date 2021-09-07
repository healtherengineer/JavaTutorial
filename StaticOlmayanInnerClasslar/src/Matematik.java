
import java.util.Scanner;

public class Matematik
{

    Scanner scanner = new Scanner(System.in);
    private double PI = Math.PI;

    public class Faktoriyel
    {

        public void faktoriyelHesapla()
        {

            System.out.println("Faktoriyeli alinacak bir sayi giriniz : ");
            int sayi = scanner.nextInt();
          if(sayi<0)
          {
              System.out.println("Girdiginiz sayi 0 veya daha büyük olmalıdır...");

          }
             int sum = 1;
                for (int i = 1; i <=sayi; i++)
                {
                    sum =sum*i;
                }
                System.out.println(sayi + " Sayisinin faktoriyeli  :" + sum);
            
          

        }
    }

    public class Asal
    {

        public boolean asalMı(int sayi)
        {
            int i = 2;
            while (sayi > i)
            {
                if (sayi % i == 0)
                {
                    System.out.println("Sayiniz asal degildir ...");
                    return false;
                }
                i++;
            }
                                System.out.println("Sayiniz asaldir ...");

            return true;

        }
    }

    public class Alan
    {
        public void alanMessage()
        {
            System.out.println("Alan Hesaplanıyor...");
            System.out.println("Alanını hesaplamak istediginiz dairenin yaricap degerini giriniz : ");
        }
        public class DaireAlan
        {

            public void daire_alan(int yaricap)
            {
                System.out.println(+yaricap + " Yaricapli dairenin alani : " + (yaricap * yaricap * PI));
                // ÇERCEVEDEKİ EN DIŞTAKI PI DEGERİNİ PRİVATE OLMASINA RAGMEN KULLANDIM FARK EDERSEN !!!

            }
        }

    }

}
