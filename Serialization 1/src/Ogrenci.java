
import java.io.Serializable;


public class Ogrenci implements Serializable
{
    String isim;
    int id;
    String bolum;

    public Ogrenci(String isim, int id, String bolum)
    {
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
