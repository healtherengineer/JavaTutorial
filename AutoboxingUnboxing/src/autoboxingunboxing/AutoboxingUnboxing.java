
package autoboxingunboxing;

import java.util.ArrayList;


public class AutoboxingUnboxing
{

    
    public static void main(String[] args)
    {
        /*
      //Wrapper Classes
        char-->Character
         boolean --> Boolean
           int --> Integer
             double --> Double
                     Long--->long
                             byte -->Byte
                                     .
                                     .
                                     .
                */
        ArrayList<String> arr1 = new ArrayList<String>();
        // bir sıkıntı cıkmadı çunku String veri tipinde tanımladık
        // hadi int tipinde bir arraylist olusturmayı dene
    //    ArrayList<int> arr2 = new ArrayList<int>(); // unexpected type  : int required :  reference 
        // biz her zaman arrayliste bir reference vermemiz gerekli
        // ama biz integer bir deger tutmak istersek wrapper classla yaparız
        ArrayList<Integer> arr2 = new ArrayList<Integer> ();
        
        for (int  i = 0 ;i<10 ; i++)
        {
            arr2.add(Integer.valueOf(i*3)); // bunu sen boşu boşuna yapıyorsun java benim yerime zaten yapıyor!!! buna autoBoxing denir
            // int bir veri tipindeki degeri kutulayıp Integer wrapper class tipinde bir listeye katmaya Autoboxing denir.
            arr2.add(i*4); // aynı şey hatta daha iyisi.
        }
        for(int i = 0;i<arr2.size() ; i++)
        {
            System.out.println(arr2.get(i).intValue()); // intvalue == Integer tipindeki bir şeyi int olarak döndürür.
            // ama ne gerek var onu kutusundan cıkarıp ilkel bir veri tipini elimizle yapmaya
            // zaten java bizim yerimize bunları yapıyor ...
            System.out.println(arr2.get(i)); // aynı şey hatta daha iyisi...
        }
        
        
                                     
        
        
    }
    
}
