package linkedlistgiris;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListGiris
{

    public static void liste_bastir(LinkedList<String> gidilecek_yerler)
    {
        /*  for(String s : gidilecek_yerler)
         {
         System.out.println(s);
         }*/ // for each döngüsü ile böyle
        //Iterator le basalım bakalım
        ListIterator iterator = gidilecek_yerler.listIterator();
        //iterator burda gidilecek_yerlerin referansini tutuyor next dediğimde
        //0. indexin referansindan başlıyor

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

    public static void sirali_ekle(LinkedList<String> gidilecek, String yeni)
    {
        // iterator a ait compare to metodu var ona bakalım
        ListIterator<String> iterator = gidilecek.listIterator();

        while (iterator.hasNext())
        {
            int karsilastir = iterator.next().compareTo(yeni);
            // eğer yeni eklenecek eleman bir önceki elemana eşit ise
            if (karsilastir == 0)
            {
                System.out.println("Eklemek istediginiz eleman zaten Listenizde Mevcuttur.");
                return;
            }
            else if (karsilastir < 0)
            {

                // yeni deger iterator.next'ten daha buyuk -1 çıkma durumu
                //while ın başına yolluyoruz siradaki degerle karsilaiması icin fark ettiysen while in icindeyiz !!!
            }
            else if (karsilastir > 0)
            {
                // iterator.next daha buyuk yeni den 1 cıkma durumu 
                iterator.previous();
                iterator.add(yeni); // bir önceki referans a yeni yi ekle!!!
                return;

            }
        }
        iterator.add(yeni);

    }

    public static void main(String[] args)
    {
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
/*
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Ofis");
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Kafe");

        liste_bastir(gidilecek_yerler);
        System.out.println("--------------------------");
        gidilecek_yerler.add(1, "Annem'in Evi");
        liste_bastir(gidilecek_yerler);
       */
        sirali_ekle(gidilecek_yerler, "Okul");
        sirali_ekle(gidilecek_yerler, "Haldun Dayım'gil");
        sirali_ekle(gidilecek_yerler, "Annem'in Evi");
        sirali_ekle(gidilecek_yerler, "Market");
        sirali_ekle(gidilecek_yerler, "Kafe");
        sirali_ekle(gidilecek_yerler, "Postane");
        sirali_ekle(gidilecek_yerler, "Ofis");
        System.out.println("-------------------------------");
        liste_bastir(gidilecek_yerler);
        System.out.println("-------------------------------");
               /* sirali_ekle(gidilecek_yerler, "Ofis");
                sirali_ekle(gidilecek_yerler, "Zonguldak"); // listedeki en büyük string olduğungdan en son iterator.next e kadar gitti 
                                                            // ve en son a bağlandı
                
                        System.out.println("-------------------------------");

                liste_bastir(gidilecek_yerler);
                       */

        

    }

}
