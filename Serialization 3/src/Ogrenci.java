
import java.io.Serializable;


public class Ogrenci implements Serializable
{
    private String isim;
    private  int  id;
    private String bolum;

    private static int ogrenciSayisi ;

    public static int getOgrenciSayisi()
    {
        return ogrenciSayisi;
    }

    public static void setOgrenciSayisi(int ogrenciSayisi)
    {
        Ogrenci.ogrenciSayisi = ogrenciSayisi;
    }
    
    
    public Ogrenci(String isim, int id, String bolum)
    {
        Ogrenci.setOgrenciSayisi(++ogrenciSayisi);
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString()
    {
       String bilgiler = "Öğrenci'nin ismi : " +isim
                        +"\nÖğrenci'nin id : " +id
                        +"\nÖğrenci'nin bolumu : " + bolum;
       
       return bilgiler;
    }
    
    
    
     
    
}
