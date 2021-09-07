
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class OyunKayit
{
    public static void oyunKaydet(Kart[][] kartlar){
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))) {
            
            
            out.writeObject(kartlar);
            
            
        } catch (IOException ex)
        {

            System.out.println("Dosya açılırken hata oluştu...");
        }
        
        
    }
    
    public static Kart[][] kayittanAl(){
        
        try(ObjectInputStream in  = new ObjectInputStream(new FileInputStream("kayit.bin"))) {
            
            Kart[][] cikti =  (Kart[][])in.readObject();
            
            return cikti;
            
            
            
        } catch (IOException ex)
        {
            System.out.println("Dosya açılırken bir hata oluştu...");
        } catch (ClassNotFoundException ex)
        {

            System.out.println("Class bulunamadı ...");
        }
        return null;
        
        
    }
    
    
    
    
}
