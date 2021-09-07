package calısanproje;

public class Yazilimci extends Calisan {

    private String diller;
    // ilerde arraylistlerle bunu yapcaz diller diye.

    public Yazilimci(String isim, String soyisim, String id, String diller) {
        super(isim, soyisim, id);
        this.diller = diller;

    }

    public void bilgiVer() {
        super.bilgiVer();
        System.out.println("Bildigi diller : " + diller);
    }

    public void formatAt(String sistem) {
        System.out.println(getAd() + " " + sistem + " i yüklüyor...");
    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }

}
