
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    private static ArrayList<Integer> icerik = new ArrayList<>();
    
    public static void dosyaOku(){
        FileInputStream veri =null;
        try
        {
            veri = new FileInputStream("muzik");
            int deger ;
           
            while((deger = veri.read()) != -1 ){
                
                icerik.add(deger);
           
                
            }
            
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    public static void kopyala(String dosyaismi) {
        
        
        FileOutputStream yeni = null;
        
        try
        {
            yeni = new FileOutputStream(dosyaismi);
            
           for(int deger : icerik){
               
               
               yeni.write(deger);
               
               
           }
            
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public static void main(String[] args)
    {
        dosyaOku();
        
        kopyala("muzik1.mp3");
    }
    
}
