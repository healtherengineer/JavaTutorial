package ınheritancedetails;

public class Hayvan {
    //SUPER CLASS

    private String isim;
    private int kilo;
    private int boy;

    public Hayvan(String isim, int kilo, int boy) {
        this.boy = boy;
        this.isim = isim;
        this.kilo = kilo;

    }

    public void hareketEt(int hiz) {
        System.out.println("Hayvan " + hiz + " ile hareket ediyor ...");

    }

    public void yemekYe() {
        System.out.println("Hayvan şu an yemek yiyor...");
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

}
