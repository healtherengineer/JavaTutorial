package ınheritance.pkg1;

public class Calisan {
 // super classımız 
    private String isim;
    private int maas;
    private String departman;
    
// çalışan constructorımız . 
    
    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        System.out.println("Calısan constructorı çalıştı");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void bilgiVer() {
        System.out.println("Isim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Departman : " + departman);
    }

    public void zamYap(int miktar) {
        maas +=miktar;
        System.out.println("Çalışana " + miktar + " tl  zam yapıldı ...");
    }

}
