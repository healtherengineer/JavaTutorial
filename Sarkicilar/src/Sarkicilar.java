
import java.util.ArrayList;

public class Sarkicilar
{

    private ArrayList<String> sarkicilar = new ArrayList<String>();
 

   
  

    public void sarkici_bastir()
    {
        System.out.println("Sarkici listesinde " + sarkicilar.size() + " kadar sarkıcı var...");
        for (int i = 0; i < sarkicilar.size(); i++)
        {
            System.out.println((i + 1) + ". Sarkici: " + sarkicilar.get(i));
        }
    }

    public void sarkici_ekle(String isim)
    {
        sarkicilar.add(isim);
        
    }
   
    /* public void sarkici_sil(String isim) //overload method
     {
     int pozisyon = sarkicilar.indexOf(isim);
     sarkicilar.remove(isim);
     System.out.println(pozisyon + ". pozisyondaki " + "(" + isim + ")" + " Sarkici listeden Silindi...");

     }*/
    public void sarkici_sil(int pozisyon)
    {

        if (pozisyon >= 0)
        {

            String isim = sarkicilar.get(pozisyon);
            sarkicilar.remove(pozisyon);
            System.out.println((pozisyon + 1) + ". pozisyondaki " + "(" + isim + ")" + " Sarkici listeden Silindi...");
        }

        else
        {
            System.out.println("Aradiginiz sanatci listemizde bulunmamaktadir...");
        }

    }

    public void sarkici_guncelle(String yeni_isim, int indx)
    {// kontrol et olum listede varmı yokmu

        if (indx >= 0)
        {
            sarkicilar.set((indx), yeni_isim);
            System.out.println("Sarkicilar listesi Güncellendi...");
        }

        else
        {
            System.out.println("Aradiginiz sanatci listemizde bulunmamaktadir...");
        }

    }

    public void sarkici_ara(String isim)
    {
        int indx = sarkicilar.indexOf(isim);
        if (indx >= 0)
        {
            System.out.println(sarkicilar.get(indx) + " adli sarkici listemizin " + (indx+1) + ". sirasindadir ...");
        }
        else
        {
            System.out.println("Aradiginiz sanatci listemizde bulunmamaktadir...");
        }
    }

}
