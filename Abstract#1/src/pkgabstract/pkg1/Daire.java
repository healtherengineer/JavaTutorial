package pkgabstract.pkg1;


public class Daire extends Sekil
{

    int yaricap;

    public Daire(String isim, int yaricap)
    {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla()
    {

        System.out.println(getIsim() + "'in alanı " + (Math.PI * yaricap * yaricap) + "'dir...");
    }

}
