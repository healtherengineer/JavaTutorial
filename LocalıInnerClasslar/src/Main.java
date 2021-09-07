
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        

       class Faktoriyel // lokal inner class dır 
        {

            public void faktHesapla(int sayi) // lokal ınner classlarda static seyler olamaz lokaldir o method bittiği anda artık biter... orada ölür...
            {
                //methodda biter...
                
                int sum = 1;
                for (int i = 1; i <= sayi; i++)
                {
                    sum *= i;

                }
                System.out.println(sayi + " sayisinin faktoriyeli " + sum + "'dir...");

            }
        }
        
        Faktoriyel fakt = new Faktoriyel();
        System.out.println("Faktoriyel degerini giriniz : ");
        fakt.faktHesapla(scanner.nextInt());

    }

}
