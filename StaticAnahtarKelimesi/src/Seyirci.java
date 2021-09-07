
public class Seyirci
{

    private String isim;
    private static int seyirciSayisi = 0;
    

    public Seyirci(String isim)
    {
        
        this.isim = isim;
        seyirciSayisi++;
    }

    public static int getSeyirciSayisi()
    {
      //  System.out.println(isim); // static bir methodun icinde static olmayan bir attribute kullanamazsın bünyaminnn
        return seyirciSayisi;
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }
    public void oyunSeyret()
    {  
        
        System.out.println(isim + " oyun seyrediyor...");
        
    }

}
