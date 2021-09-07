
package calısanproje;
// Super class

public class Calisan {
    private String ad;
    private String soyad;
    private String id;
    
    public Calisan(String ad,String soyad,String id)
    {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void bilgiVer()
    {
        System.out.println("****Calisan bilgileri ***** ");
        System.out.println("Calisanin ismi : " +ad);
        System.out.println("Calisanin Soyismi : " + soyad);
        System.out.println("Calisan id  : " + id);
    }
    
}
