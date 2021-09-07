
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        
        /*try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            
            while(scanner.hasNextLine()) {
                
                String icerik = scanner.nextLine();
                String[] ogrenci_bilgisi = icerik.split(",");
                if(ogrenci_bilgisi[1].equals("Bilgisayar Mühendisliği")) {
                     
           
                     System.out.println("Okunan içerik : " + icerik);
              
                }
               
            }
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Dosya açılırken bir hata oluştu ...");
        }
        */
        
//        
//     try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {
//            
//            while(scanner.hasNextLine()) {
//                
//                String icerik = scanner.nextLine();
//                String[] ogrenci_bilgisi = icerik.split(",");
//                if(ogrenci_bilgisi[1].equals("Bilgisayar Mühendisliği")) {
//                     
//           
//                     System.out.println("Okunan içerik : " + icerik);
//              
//                }
//               
//            }
//            
//            
//        } catch (FileNotFoundException ex)
//        {
//            System.out.println("Dosya açılırken bir hata oluştu ...");
//        }
        
        
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true)))
        {
            
            writer.write("Zülhima Sığnak , Uluslararası İlişkiler\n");
            
        } catch (IOException ex)
        {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }
        
    }
    }
    

