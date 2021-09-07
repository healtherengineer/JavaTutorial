
package com.ege.paket1;

import com.ege.paket2.AdayOgrenci; //paket 2 nin içine girdim

public class Ogrenci implements AdayOgrenci
{

    @Override
    public void ders_calis()
    {
        System.out.println("Ders Çalışıyorum...");
    }
    
}
