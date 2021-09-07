
package arraylists;

import java.util.ArrayList;


public class ArrayLists {
public static void yazdir(ArrayList<String> reference)
{
    for(int i = 0 ; i<reference.size() ; i++)
    {
        System.out.println(reference.get(i));
    }
}   
    public static void main(String[] args) {
        
        ArrayList<String>  arraylist = new ArrayList<String>();
        arraylist.add("Zeki Müren");
        arraylist.add("Serdar Ortac");
        arraylist.add("Melike Şahin");
        arraylist.add("Adele");
        
        /*System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.get(3));
        
                System.out.println(arraylist.get(4));// IndexOutOfBoundsException hatası 
                */
        
        // hadi yazdiralım
        // mesela şurda birşeyler oldu 5 . satıra birşey eklemen gerekti naparsın
        arraylist.add(4, "Sting"); //bunu yapabilirsin ama stingi de o kadar çok sevmiyorum değiştir bakalım
        arraylist.set(arraylist.lastIndexOf("Sting"), "Tarik Menguc"); // bu şu demek Sting in oldugu indexi Tarik mengüc le değiş
                                                //set komutu güncellememe izin verir
        
        /*
        for(int i = 0 ;i<arraylist.size(); i++)
        {
            System.out.println("Element " + (i+1)+": " +arraylist.get(i));
        }
                */
        // ben çok sıkıldım elle yazdırmaktan ben fonksiyon yapcam.
// yollaaaaaaaaaaaaaaaaaaaaaaaaaaaaa fonksiyonaaaaa
        // serdari sevmiyorum onu kaldırsana
  //      arraylist.remove("Serdar Ortac");
        // bak şimdi bide şöyle kaldırabiliyorsun
        arraylist.remove(3);
        yazdir(arraylist);
        
        
        
        
        
    
    }
    
}
