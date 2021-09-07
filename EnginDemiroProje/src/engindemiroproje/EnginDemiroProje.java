
package engindemiroproje;

public class EnginDemiroProje
{

    public static void main(String[] args)
    {
        
        // REFERANS TİPLERİ ANLAMAK
        int sayi1  =10;
        int sayi2 = 20;
         sayi1= sayi2;
         sayi2 = 100;
         System.out.println(sayi1);
         //***********************************
         int[] sayilar1 ={1,3,42,4};
          int[] sayilar2 ={11,3,2,42};
          sayilar1 = sayilar2; // sayilar 2 nin referansıni sayilar 1 e atadik 
                               // yani 101 ise sayilar 1 artık 102 yi gösteriyor.
          sayilar2[0]=777;
          
          System.out.println(sayilar1[0]);
          System.out.println(sayilar2[0]);
        
        

    }

}
