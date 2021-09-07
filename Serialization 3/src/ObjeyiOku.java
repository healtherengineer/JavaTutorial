
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ObjeyiOku
{
    public static void main(String[] args)
    {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            
            Ogrenci ogrenci = (Ogrenci)in.readObject();
            
            System.out.println(ogrenci);
            
            System.out.println("Anlık Öğrenci Sayısı : " + Ogrenci.getOgrenciSayisi());
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex)
        {
            System.out.println("IOException oluştu...");
        } catch (ClassNotFoundException ex)
        {
            System.out.println("Class bulunamadı ...");
        }
        
    }
    
}
