
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        // file output Stream i kullanarak bir nesne üretiyoruz 
        FileOutputStream fos = null;
        
        try
        {
            // bir tane outputları göstereceğimiz bir dosya atıyoruz constun içine
            fos = new FileOutputStream("test.txt",true); // yanda true yapmamızın sebebi dosyanın içinde ki veri kayıtlı kalsın üstüne yazalım diye.!
            
          //  fos.write(84);
            //fos.write(65);
            // write methoduyla yazıyoruz...
            fos.write(88);
            fos.write(98);
            
            // byte diziside ekleyebiliriz
        byte[] array = {101,75,66,68};
            
            fos.write(array);
            
            // string de ekleyebiliriz byte dizisine çevirerek...
            String s_array = "Ege Barisan";
            
         
            byte [] a =s_array.getBytes();
            fos.write(a); 
            
            
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya bulunumadı Hatası oluştu...");
        } catch (IOException ex)
        {
            System.out.println("Dosyaya yazılırken bir hata oluştu ...");

        }
        
        try
        {
            
            fos.close();
        } catch (IOException ex)
        {
            System.out.println("Dosya kapatılırken bir hata oluştu...");

        }
        
        
        
    }
    
}
