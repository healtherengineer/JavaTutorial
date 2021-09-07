
package whileatmprogramı;

import java.util.Scanner;


public class WhileAtmProgramı {

    
    public static void main(String[] args) {
        // to do list : 
        /*
        1.işlem Bakiye öğrenme
        2.işlem Para çekme
        3. işlem para yatırma 
        çıkmak için q ya basınız. 
        
        */
        Scanner scanner =new Scanner(System.in);
        double bakiye = 1000.0;
        String islemler = "Islemler ; \n"
                         + "1.işlem : Bakiye Ogrenme\n" 
                         +"2.işlem : Para Çekme\n"
                         +"3.işlem : Para Yatırma  \n"
                          +"Çıkmak için q' ya basınız .";
        
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");
        
        while(true)
        {
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
           String islem= scanner.nextLine();
           
           if(islem.equals("q"))
           {
               System.out.println("Programdan çıkılıyor ..."); break;
           }
           else if(islem.equals("1"))
           {
               System.out.println("Bakiyeniz : " + bakiye );
           }
           
            else if(islem.equals("2"))
           {
               System.out.println("Çekmek istediğiniz tutarı giriniz : ");
               double tutarCek=scanner.nextDouble();
               scanner.nextLine();//Dummy
               if(bakiye-tutarCek < 0)
               {
                   System.out.println("Çekmek istediğiniz tutar Bakiyenizi aşıyor ...");
               }
               else
               {
                   bakiye =bakiye-tutarCek;
                   System.out.println( tutarCek +"'lik tutar Bakiyenizden çekilmiştir  . ");
                   System.out.println("Güncel Bakiyenizi öğrenmek için '1' e basınız ; ");
               }
             
           }
            else if(islem.equals("3"))
           { 
               System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
               double tutarYatır=scanner.nextDouble();
               scanner.nextLine();// sayı dan  sonra bir string alacaksan mutlaka dummy kullan.
               bakiye=bakiye+tutarYatır;
               System.out.println(tutarYatır + " 'lık miktar hesabınıza tarafınızdan ilave edilmiştir. ");
                    System.out.println("Güncel Bakiyenizi öğrenmek için '1' e basınız ; ");
               
             
           }
           else
            {
                System.out.println("Geçersiz işlem seçtiniz ...");
            }
           
           
        }
        
      
    }
    
}
