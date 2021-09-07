package calısanproje;

//subclass
public class Yonetici extends Calisan {

    private int sorumlu_kisi;

    public Yonetici(String isim, String soyisim, String id, int sorumlu_kisi) {
        super(isim, soyisim, id);
        this.sorumlu_kisi = sorumlu_kisi;

    }

    public void bilgiVer() {
        super.bilgiVer();
        System.out.println("Sorumlu oldugu kisi sayisi : " + sorumlu_kisi);

    }

    public void zamYap(Calisan staff, int miktar) {
        System.out.println(getAd() + "," + staff.getAd() + " adlı calısana " + miktar + "tl zam yapıyor...");

    }

}
