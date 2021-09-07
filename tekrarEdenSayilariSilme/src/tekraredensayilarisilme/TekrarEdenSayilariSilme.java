
package tekraredensayilarisilme;

import java.util.Scanner;


public class TekrarEdenSayilariSilme {

    
      public static void tekrarSil(int[] example)
    {
        int c = 0;
        int n = example.length;
        for(int i = 0 ;i< n ; i++)
        {
            for(int j = 0 ; j<n; j++)
            {
               
                if(example[i] == example[j])
                { 
                    c++;
                    if(c>1)
                    {
                         for(int a =j ; a < n-1; a++)
                    {
                       
                            example[a] = example[a+1];
                        
                        
                    }
                    n--;
                        
                    }
                    
                }
                
            }
            c=0;
        }
        System.out.println("**********************");
       // bubbleSort(example);
        for(int t = 0 ; t<n ; t++)
        {
            System.out.print(example[t] + " ");
        }
    }
       public static int[] arrayDoldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.print((i + 1) + ". Sayiyi giriniz : ");
            arr[i] = scanner.nextInt();
        }

        return arr;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = scanner.nextInt();
        int[] dizi = arrayDoldur(n);
        tekrarSil(dizi);
 

    }
    
}
