package magazaprojesi;

public class Mudur extends Calisan
{

    private static int CIPLAK_MAAS = 2000;
    private static int PRIM_LIMITI = 20000;
  private int aylikSatis;
    /**
     * @return the CIPLAK_MAAS
     */
    public static int getCIPLAK_MAAS()
    {
        return CIPLAK_MAAS;
    }

    /**
     * @param aCIPLAK_MAAS the CIPLAK_MAAS to set
     */
    public static void setCIPLAK_MAAS(int aCIPLAK_MAAS)
    {
        CIPLAK_MAAS = aCIPLAK_MAAS;
    }

    /**
     * @return the PRIM_LIMITI
     */
    public static int getPRIM_LIMITI()
    {
        return PRIM_LIMITI;
    }

    /**
     * @param aPRIM_LIMITI the PRIM_LIMITI to set
     */
    public static void setPRIM_LIMITI(int aPRIM_LIMITI)
    {
        PRIM_LIMITI = aPRIM_LIMITI;
    }
  

    // java bana kızıyor diyor ki hemen extend ettiğin classın constructorını oluştur 
    public Mudur(String isim, String soyisim)
    {
        super(isim, soyisim);

    }
    // hemen abstract sınıftan inherite ettiğin methodlari overrride edip mudur sınıfına göre düzenle

    @Override
    public double maasHesapla()
    {
        if (getAylikSatis() > getPRIM_LIMITI())
        {
            return (getAylikSatis() - getPRIM_LIMITI()) * 0.1 + getCIPLAK_MAAS();
        }
        else
        {
            return getCIPLAK_MAAS();
        }

    }

    @Override
    public String kimimBen()
    {
        return "Müdür";
    }

    /**
     * @return the aylikSatis
     */
    public int getAylikSatis()
    {
        return aylikSatis;
    }

    /**
     * @param aylikSatis the aylikSatis to set
     */
    public void setAylikSatis(int aylikSatis)
    {
        this.aylikSatis = aylikSatis;
    }

    
    

}
