
package magazaprojesi;

public class Tezgahtar extends Calisan
{
    private int satis;

    public Tezgahtar(String isim, String soyisim)
    {
        super(isim, soyisim);
    }

    @Override
    public double maasHesapla()
    {
        return satis * 0.1;
    }

    @Override
    public String kimimBen()
    {
        return "Tezgahtar";
    }

    /**
     * @return the satis
     */
    public int getSatis()
    {
        return satis;
    }

 
     
    public void setSatis(int satis)
    {
        this.satis = satis;
    }
    
}
