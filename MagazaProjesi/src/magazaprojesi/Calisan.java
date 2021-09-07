package magazaprojesi;

public abstract class Calisan
{

    private String isim;
    private String soyisim;

    public Calisan(String isim, String soyisim)
    {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public void bilgiVer()
    {
        System.out.println("Calisanin Adi'i : " + isim);
        System.out.println("Calisanin Soyism'i : " + soyisim);
        System.out.println("Calisanin Pozisyonu : " + kimimBen());
        System.out.println("Calisanin Maasi     : " + maasHesapla());

    }

    public abstract double maasHesapla();

    public abstract String kimimBen();

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getSoyisim()
    {
        return soyisim;
    }

    public void setSoyisim(String soyisim)
    {
        this.soyisim = soyisim;
    }

}
