
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        FileWriter writer = null ;
        
        try
        {
            writer = new FileWriter("dosya.txt",true);
            
         //   writer.write("Ceren Barışan\n");
           // writer.write("Sezaver Barışan\n");
           // writer.write("Ege Barışan");
            writer.write("\nDiren Barışan");
            
            
            
        } catch (IOException ex)
        {
            System.out.println("Dosya açılırken bir hata oluştu ...");
        }
        
        
        finally {
            
            if(writer != null) {
                
                try
                {
                    writer.close();
                    
                } catch (IOException ex)
                {
                    System.out.println("Dosya kapatılırken bir hata oluştu ...");
                }
                
            }
            
        }
        
        
    }
    
}
