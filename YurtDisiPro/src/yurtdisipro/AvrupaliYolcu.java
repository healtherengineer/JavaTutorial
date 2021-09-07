/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisipro;

/**
 *
 * @author egeba
 */
public class AvrupaliYolcu extends Yolcu implements IEuVatandasi
{

    String[] vizeli_ulkeler = new String[7];

    public AvrupaliYolcu()
    {
        super();
        vizeli_ulkeler[0] = "Portekiz";
        vizeli_ulkeler[1] = "Belcika";
        vizeli_ulkeler[2] = "Almanya";
        vizeli_ulkeler[3] = "Italya";
        vizeli_ulkeler[4] = "Fransa";
        vizeli_ulkeler[5] = "Polonya";
        vizeli_ulkeler[6] = "Slovakya";
        // yeni bir ülke AB ye girerse tek satırda buraya ekleyerek programda yenilik sağlayabilirim 
        // kolaylıkla

    }

    @Override
    public String hangi_birlik()
    {
        return "Avrupa Birligi Uyesisiniz...";
    }

    @Override
    public boolean ulke_vize_kontrolu(String gidilecek_ulke)
    {
        for (int i = 0; i < vizeli_ulkeler.length; i++)
        {
            if (vizeli_ulkeler[i].equalsIgnoreCase(gidilecek_ulke))
            {
                System.out.println(gidilecek_ulke + "' ye vizeniz bulunmaktadır...");
                return true;
            }

        }
        System.out.println(gidilecek_ulke + "' ye vizeniz Bulunmamaktadır...\n"+ gidilecek_ulke +" Avrupa birliginde degildir ..." );
        return false;

    }
    public boolean avrupali_mi(String vatandaslik)
    {
         for (int i = 0; i < vizeli_ulkeler.length; i++)
        {
            if (vizeli_ulkeler[i].equalsIgnoreCase(vatandaslik))
            {
                
                return true;
            }

        }
         return false;
        
    }

}
