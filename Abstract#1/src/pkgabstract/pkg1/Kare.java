package pkgabstract.pkg1;


import pkgabstract.pkg1.Sekil;


public class Kare extends Sekil
{

    @Override
    public String toString()
    {
        return "Bu bir Kare'dir...";
    }

    int kenar;

    public Kare(String isim, int kenar)
    {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla()
    {

        System.out.println(getIsim() + "'nin alani " + (kenar * kenar) + "'dir...");

    }

    public void cevreHesapla()
    {
        System.out.println(getIsim() + "'in cevresi " + (kenar * 4) + "'dir...");
    }

}
