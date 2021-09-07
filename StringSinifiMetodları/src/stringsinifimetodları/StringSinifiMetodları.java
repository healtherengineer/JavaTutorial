package stringsinifimetodları;

public class StringSinifiMetodları
{

    public static void main(String[] args)
    {

        /* String a1 = "FenerBahce";
         System.out.println("0. index  : " + a1.charAt(0));
         // haydii stringimizin index lerinde gezinelim
         for (int i = 0; i < a1.length(); i++)
         {
         System.out.println(a1.charAt(i));

         }
         for (int i = 0; i < a1.length(); i++)
         {
         System.out.print(a1.charAt(i) + " ");
         }
         System.out.println("");
         System.out.println(a1.startsWith("Fe"));//  bununla başlar mı diyor kuçuk buyuk harf e duyarlı case sensitve
         System.out.println(a1.endsWith("Ce"));
         System.out.println("a harfi String imizin " + a1.indexOf('e') + ".indexinde bulunuyor.") ;
         System.out.println(a1.lastIndexOf('e'));
         */
        String a1 = "Mustafa";
        // BU İKİSİNİN REFERANSLARI AYNI YERİ GÖSTERİRRRRR...

        String a2 = "Mustafa";
        if (a1 == a2)
        {
            System.out.println("Esitler...");

        }
        //BUTTTT
        String b1 = new String("EGE");
        // bu ikisinin referasnları new lendiği icin farkli yerleri gösterirler ....
        String b2 = new String("EGE");
        if (b1 == b2)
        {
            System.out.println("Esitlerrrrdirr...");
        }
        else
        {
            System.out.println("Referansları farklı yerleri gösterirrr");
        }
        //ila kıyaslamak istersek 

        if (b1.equals(b2))
        {
            System.out.println("Esitler dir equals methodu içeriklerini kıyaslar...");
        }

        String word = "1907";
        int n1 = Integer.parseInt(word); // stringi ıntegera ceviririz
        System.out.println(n1);
        int n2 = 2500;
        String word1 = String.valueOf(n2); // int ten stringe cevirmeeee!!!

        System.out.println(word1);

    }

}
