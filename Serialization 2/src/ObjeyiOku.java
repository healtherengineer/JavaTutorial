
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku
{
    public static void main(String[] args)
    {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {
            
            
            Ogrenci[] ogrenciListesi =(Ogrenci[]) in.readObject(); // array i okuduk
            ArrayList<Ogrenci> ogrenciArrayList =(ArrayList<Ogrenci>)in.readObject();//arrayListi okuduk

            System.out.println("**********************************************");
            for(Ogrenci o: ogrenciListesi) {
                
                
                System.out.println(o);
                System.out.println("---------------------------------------");
            }
            
            
            System.out.println("**********************************************");
            for(Ogrenci o: ogrenciArrayList) {
                
                
                System.out.println(o);
                System.out.println("---------------------------------------");
                
            }
            System.out.println("**********************************************");

            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex)
        {
            System.out.println("IOException oluştu...");
        } catch (ClassNotFoundException ex)
        {
            System.out.println("Class bulunamadı...");
        }
        
    }
    
}
