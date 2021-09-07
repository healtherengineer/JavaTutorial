
package magazaprojesi;


public class Hizmetli extends Calisan
{
    public static final int saatUcreti =10;
    private int mesaiSaati;

    public Hizmetli(String isim, String soyisim)
    {
        super(isim, soyisim);
    }

    public int getMesaiSaati()
    {
        return mesaiSaati;
    }

    public void setMesaiSaati(int mesaiSaati)
    {
        this.mesaiSaati = mesaiSaati;
    }

    @Override
    public double maasHesapla()
    {
       return mesaiSaati * saatUcreti;
       
    }

    @Override
    public String kimimBen()
    {
        return "Hizmetli";
    }
    
    
}
