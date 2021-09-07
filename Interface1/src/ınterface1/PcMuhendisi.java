package ınterface1;

public class PcMuhendisi extends Muhendis implements IMuhendis
{// java hata verdiii implemente etmediğimiz icin fonksiyonlari

    private boolean askerlik;
    private boolean adli_sicil;

  public PcMuhendisi(String ad, String soyad,boolean askerlik, boolean adli_sicil)
    {
        super(ad,soyad);
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula()
    {
        if (askerlik)
        {
            System.out.println("Askerligimi Tamamladim.");
        }
        else
        {
            System.out.println("Askerligimi henüz Tamamlamadim.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece)
    {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgulama()
    {
        if (adli_sicil)
        {
            System.out.println("Adli sicil kaydım bulunmaktadir.");
        }
        else
        {
            System.out.println("Adli sicil kaydım bulunmamaktadır.");
        }
    }

    @Override
    public void is_tecrubesi(String[] arr)
    {
        if (arr.length > 0)
        {
            System.out.println("Bilgisayar Mühendisi olarak calistigim Kurumlar : ");
            for (int i = 0; i < arr.length; i++)
            {

                System.out.println("--> " + arr[i]);

            }
        }
        else
        {
            System.out.println("Bu konuda herhangi bir is tecrübem bulunmamaktadir...");
        }
    }

}
