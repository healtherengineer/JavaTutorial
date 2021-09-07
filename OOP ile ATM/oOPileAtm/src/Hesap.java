
public class Hesap {

    private String kullanici_adi;
    private String parola;

    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void bilgiVer() {
        System.out.println("Bakiyeniz : " + this.bakiye);

        System.out.println("Kullanıcı Adınız : " + this.kullanici_adi);

    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int miktar) {
        bakiye += miktar;
        System.out.println("Güncel bakiyeniz : " + bakiye);
    }

    public void paraCek(int miktar) {
        if (bakiye - miktar < 0) {
            System.out.println("Hesabınızda yeterli miktar yoktur....");
        } else {
            bakiye -= miktar;

            System.out.println("Güncel bakiyeniz : " + bakiye);
        }

    }

}
