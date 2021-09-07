package ınterface1;

public class Interface1
{

    public static void main(String[] args)
    {
        // IMuhendis muhendis1 = new IMuhendis();
        //İNTERFACELERDEN ASLA VE ASLA NESNE OLUŞTURULAMAZ!!!

        PcMuhendisi muhendis1 = new PcMuhendisi("Ramazan", "KAHRAMAN", false, false);
        muhendis1.bilgi();
        muhendis1.adli_sicil_sorgulama();
        muhendis1.askerlik_durumu_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.12));
        String[] tecrube1 =
        {
            "SadikOgullari Yazılım ", "Bera ARGE-YAZILIM", "Asekod ARGE-YAZILIM", "Iyzico Financial Software as Intern"
        };
        muhendis1.is_tecrubesi(tecrube1);

        // bir kullanım daha var
        System.out.println("-------------------------------------------");
        PcMuhendisi muhendis2 = new PcMuhendisi("Mustafa", "KUZ", false, false);

        muhendis2.bilgi();
        muhendis2.adli_sicil_sorgulama();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.52));
        muhendis2.is_tecrubesi(args);

        System.out.println("--------------------------------------------");
        MakineMuhendisi muhendis3 = new MakineMuhendisi("Berk", "BOYNUZ", true, true);
        muhendis3.bilgi();
        muhendis3.adli_sicil_sorgulama();
        muhendis3.askerlik_durumu_sorgula();
        System.out.println(muhendis3.mezuniyet_ortalamasi(3.3));
        String[] tecrube3 =
        {
            "SadikOgullari Yazılım ", "Bera ARGE-YAZILIM", "Asekod ARGE-YAZILIM", "Iyzico Financial Software as Intern"
        };

        muhendis3.is_tecrubesi(tecrube3);
        String[] referans =
        {
            "Sadi Evren SEKER ", "Fatih TALU"
        };
        muhendis3.referans_getir(referans);
        muhendis3.calis();

    }

}
