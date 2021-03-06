
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
            veri = new FileInputStream("izmirMarsi.mp3");
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
        long baslangic = System.currentTimeMillis();
      
        kopyala("mars1.mp3");
        kopyala("mars2.mp3");
        kopyala("mars3.mp3");

        long bitis = System.currentTimeMillis();
        
        System.out.println("3 Dosyanın kopyalanma süresi : " + ((bitis - baslangic) /1000) +" saniyedir...");
        
        
        
        
        
    }
    
}
