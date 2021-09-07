
public class Main
{
    public static void main(String[] args)
    {
     //   Seyirci seyirci1 = new Seyirci("Mustafa Zaimoglu");
        //Seyirci seyirci2 = new Seyirci("Büşra Gülnişah Ertekin");
        
       // seyirci1.oyunSeyret();
        //seyirci2.oyunSeyret();
        
     //   System.out.println("Seyirci sayisi : " + seyirci1.getSeyirciSayisi());
     //   System.out.println("Seyirci sayisi : " + seyirci2.getSeyirciSayisi());
        System.out.println("Seyirci sayisi : " + Seyirci.getSeyirciSayisi());
        
    
       // selamla(); // burda bana diyor ki
        // static olmayan bir methodu veya özelliği static bir alanda kullanamazsin !!
        // eğer kullanmak istersen static olmayan birşeyi de stati yapmalısın
        selamla();
        
        
    }
    
    public static void selamla()
    {
        System.out.println("Selamlar...");
    }
    
}
