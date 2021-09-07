package pkgabstract.pkg1;

public class Abstract1
{

    public static void main(String[] args)
    {
     
        Kare kare1 = new Kare("Kare1", 5);
        kare1.isminiSoyle();
        kare1.alanHesapla();
        kare1.cevreHesapla(); // ama bu kullanır!!!...
        Daire daire1 = new Daire("Daire1", 5);
        daire1.isminiSoyle();
        daire1.alanHesapla();
        System.out.println("----------------------------------------");

        Sekil sekil;
        sekil = new Kare("Kare2", 7);
        System.out.println(sekil);
        sekil.isminiSoyle();
        sekil.alanHesapla();
        //  sekil.cevreHesapla);  // bu kullanamaz
        System.out.println("Ama kare2 objesinin göstericisi Sekil oldugu icin cevreHesapla metodunu kullanamaz !!...");

    }

}
