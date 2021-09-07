
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        //Input stream nesnemizi oluşturduk hadi bu nesneyle dosyadan veri okuyalım
        FileInputStream fis = null;
        
        
        try
        {
            fis = new FileInputStream("dosya.txt");
           /* System.out.println("İlk okunan karakter : " + (char)fis.read()); // byte byte okuduğu için bunu char 'a dönüştürürz
             System.out.println("İkinci okunan karakter : " + (char)fis.read());
              System.out.println("Üçüncü okunan karakter : " + (char)fis.read());*/
            
            
            
            // dosyanın tamamını okumak istersek ınput stream bize -1 değer dönene kadar okuruz yanı \0 gibi düşünürüz
            
            int deger;
            int i=0;
            String okunan ="";
            
            /*while((deger = fis.read()) != -1){
                
                okunan +=(char)deger;
                
                i++;
                
            }
            
            System.out.println("Dosya içeriğinin tamamı : " + okunan );
            System.out.println("Okunan Karakter sayısı  : " + i);*/
            
            fis.skip(10);
            
            while((deger = fis.read()) != -1  && i<12 ){
                
                okunan +=(char)deger;
                i++;
            }
            System.out.println("10.karakterden sonra 10 karakter  : "  + okunan);
            
            
            
            
             
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya bulunamadı hatası oluştu ...");
        } catch (IOException ex)
        {
            System.out.println("Dosya okunurken bir hata oluştu ...");
        }
        
        finally {
            try
            {
                fis.close();
            } catch (IOException ex)
            {
                System.out.println("Dosya kapatılırken bir hata oluştu ...");
            }
            
        }
        
    }
    
}
