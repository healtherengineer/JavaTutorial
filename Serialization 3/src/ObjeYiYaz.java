
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
            
        try(ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            
            Ogrenci.setOgrenciSayisi(100);
            
            out.writeObject(ogr1);
            
            
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex)
        {
            System.out.println("IOException oluştu...");
        }
        
    }
    
}
