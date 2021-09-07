
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        // INNER CLASSLARDAN BİR OBJE OLUŞTURALIM BAKALIM
    //   Matematik.Faktoriyel factorial = new Faktoriyel(); // bunu yapamam önce matematiği oluşturmam lazım heap de 
       Matematik.Faktoriyel factorial = new Matematik().new Faktoriyel();
       Matematik.Asal asal = new Matematik().new Asal();
       Matematik.Alan alan = new Matematik().new Alan();
       Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();
       

 //Static olmadıgı icin classların icindeki methodları referanslar objeler yardımıyla kullanıyoruz....
       //static olsaydı Sınıf isimleri yeterliydi...
       
       
        System.out.println("Asallıgı kontrol edilecek sayiyi giriniz : ");
             asal.asalMı(scanner.nextInt());
       factorial.faktoriyelHesapla();
       alan.alanMessage();
       int yaricap = scanner.nextInt();
       daire_alan.daire_alan(yaricap);
       
  
       
        
        
        
    }
    
}
