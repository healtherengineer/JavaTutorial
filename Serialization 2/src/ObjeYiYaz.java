
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class ObjeYiYaz
{
    public static void main(String[] args)
    {
            Ogrenci ogr1 = new Ogrenci("Ramazan KAHRAMAN", 64, "Bilgisayar Mühendisliği");
            Ogrenci ogr2 = new Ogrenci("Mustafa ZAİMOĞLU", 66, "Bilgisayar Mühendisliği");
            Ogrenci ogr3 = new Ogrenci("Berk Boynuz", 987, "Makina Mühendisliği");
            
           Ogrenci[] ogrenciler = {ogr1,ogr2,ogr3};
          ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenciler));
        
        try(ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {
            
            out.writeObject(ogrenciler);
            out.writeObject(ogrenci_list);
            
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex)
        {
            System.out.println("IOException oluştu...");
        }
        
    }
    
}
