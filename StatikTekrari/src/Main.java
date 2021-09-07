
public class Main
{
    public static void main(String[] args)
    {
        StatikSinif s1 = new StatikSinif("Pınar");
        System.out.println("Obje Sayisi : "  + StatikSinif.objeSayisi); // s1.objeSayisi yapamayız çünkü classa özgü bir değişken nesne ye değil !
        StatikSinif s2 = new StatikSinif("Ege");
        
        System.out.println("Obje Sayisi : "  + StatikSinif.objeSayisi); // s1.objeSayisi yapamayız çünkü classa özgü bir değişken nesne ye değil !
        
        Main m1 = new Main();
         m1.toplama(3, 4, 5); // eğer method static olmazsa bir referans üretilerek method kullanılır
         toplama(1,2,4); //static olursa böyle kullanılır
        
    }
    public  static void toplama(int a ,int b ,int c){
        System.out.println(a+b+c);
        
    }
}
