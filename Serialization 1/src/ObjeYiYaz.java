
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjeYiYaz
{
    public static void main(String[] args)
    {
        
        try(ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            // hedef ogrenci.bin .ser de yazabilirdik
            Ogrenci ogr1 = new Ogrenci("Ramazan KAHRAMAN", 64, "Bilgisayar Mühendisliği");
            Ogrenci ogr2 = new Ogrenci("Mustafa ZAİMOĞLU", 66, "Bilgisayar Mühendisliği");
            
            out.writeObject(ogr1);
            out.writeObject(ogr2);
            
            
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex)
        {
            System.out.println("IOException oluştu...");
        }
        
    }
    
}
