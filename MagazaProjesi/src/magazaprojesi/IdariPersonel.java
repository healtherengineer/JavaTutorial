
package magazaprojesi;


public class IdariPersonel extends Calisan
{
    private static final int maas = 800;
    public IdariPersonel(String isim, String soyisim)
    {
        super(isim, soyisim);
    }

    @Override
    public double maasHesapla()
    {
        return maas;
    }

    @Override
    public String kimimBen()
    {
        return "Idari Personel";
    }


}
