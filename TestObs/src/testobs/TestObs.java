
package testobs;

import java.util.ArrayList;
import java.util.Scanner;


public class TestObs
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<deneme> referans = new ArrayList<deneme>();
        
        referans.add(new deneme("Haldun BARISAN", "12546"));
            System.out.println("Eklemek istediginiz parcayi giriniz : ");
          String parca = scanner.nextLine();
       System.out.println( referans.get(0).muzikler);
        
        
        
     
    }
    
}
