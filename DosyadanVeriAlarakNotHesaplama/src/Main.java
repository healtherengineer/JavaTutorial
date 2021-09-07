
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static String notHesapla(String isim ,int vize1,int vize2,int finalnot) {
        
        String cikti = "";
        
        double harfNotu = (vize1*0.3) + (vize2 * 0.3) + (finalnot * 0.4);
        
        if(harfNotu >= 95) {
            
            cikti = isim + " bu dersten AA aldı...";
        }
        else if(harfNotu >= 85) {
            
            cikti = isim + " bu dersten BA aldı...";
        }
         else if(harfNotu >= 80) {
            
            cikti = isim + " bu dersten BB aldı...";
        }
         else if(harfNotu >= 75) {
            
            cikti = isim + " bu dersten CB aldı...";
        }
         else if(harfNotu >= 70) {
            
            cikti = isim + " bu dersten CC aldı...";
        }
         else if(harfNotu >= 65) {
            
            cikti = isim + " bu dersten DC aldı...";
        }
         else if(harfNotu >= 60) {
            
            cikti = isim + " bu dersten DD aldı...";
        }
         else if(harfNotu >= 55) {
            
            cikti = isim + " bu dersten FD aldı...";
        }
         else {
             cikti = isim + " bu dersten FF aldı...";
             
         }
        
        return cikti;
        
        
        
        
    }
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("harfnotlari.txt")){
            while(scanner.hasNextLine()) {
                
                // burda okudum 
                String[] okunan = scanner.nextLine().split(",");
                //splitleyip diziye attım 
                // burda geçici değişkenlere aktardım
                int v1 = Integer.valueOf(okunan[1]);
                 int v2 = Integer.valueOf(okunan[2]);
                  int finalnot = Integer.valueOf(okunan[3]);
                  // gecici degişkenleri metoda yolladım
                  String yazılacak =  notHesapla(okunan[0], v1, v2, finalnot);
                  
                  // aldığım veri yi hedef dosyaya yazdırdım.
                  
                  writer.write(yazılacak + "\n");
                
            }
            
            
            
        }
         catch (IOException ex)
        {
            System.out.println("Dosya kapanırken bir problem oluştu...");
        }
    }
   

    
}
