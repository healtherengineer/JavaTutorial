
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main
{

    public static void mekanKontrol (int yas) throws IOException
    {
        // eğer checked bir exception yakalanabilirse bunu method da throws kelimesiyle bilgilendiriyoruz Javayı!!!!:...
        if (yas < 18)
        {

            throw new IOException();
        }
        else
        {
            System.out.println("Mekana Hoş Geldiniz...");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz : ");

        int yas = scanner.nextInt();
        
        try
        {
            mekanKontrol(yas);
        } catch (IOException ex)
        {
            System.out.println("IO Exception yakalandi...");
        }
      

    }

}
