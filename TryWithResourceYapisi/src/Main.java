
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main
{

    public static void main(String[] args)
    {
        //trywithresource yapısı otomatikman close yapar txt dosyasını
        try (FileWriter writer = new FileWriter("dosya.txt" ,true))
        {

            Scanner scanner = new Scanner(System.in);

            String dil;

            while (true)
            {

                System.out.println("Bir programlama dili ekleyiniz : ");
                dil = scanner.nextLine();

                if (dil.equals("-1"))
                {

                    System.out.println("Programdan Çıkılıyor ...");
                    System.out.println("Dosyayı Kontrol Ediniz ...");
                    break;
                }

                writer.write("\n" + dil);

            }

        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
