
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    
    public static void nesneYaz(Student std){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            
            out.writeObject(std);
            
            
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static Student nesneOku(){
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            
            Student ogr = (Student) in.readObject();
            
            return ogr;
            
            
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args)
    {
        Student ogrenci = new Student(12, "Ege");
                Student ogrenci1 = new Student(123, "Ege");

        nesneYaz(ogrenci);
        System.out.println(nesneOku());
    }
    
}
