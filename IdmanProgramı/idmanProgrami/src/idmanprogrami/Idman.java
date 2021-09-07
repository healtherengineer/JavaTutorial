package idmanprogrami;

public class Idman {

    private int situpSayisi;
    private int pushUpSayisi;
    private int squatSayisi;
    private int burbeeSayisi;

    public Idman(int situpSayisi, int pushUpSayisi, int squatSayisi, int burbeeSayisi) {
        this.situpSayisi = situpSayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.squatSayisi = squatSayisi;
        this.burbeeSayisi = burbeeSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }

    public int getBurbeeSayisi() {
        return burbeeSayisi;
    }

    public void setBurbeeSayisi(int burbeeSayisi) {
        this.burbeeSayisi = burbeeSayisi;
    }

    public void HareketYap(String hareketTuru, int mademove) {
        if (hareketTuru.equals("Burbee")) {
            burbeeYap(mademove);
        } else if (hareketTuru.equals("Squat")) {
            squatYap(mademove);
        } else if (hareketTuru.equals("Pushup")) {
            pushUpYap(mademove);

        } else if (hareketTuru.equals("Situp")) {
            sitUpYap(mademove);
        } else {
            System.out.println("Geçersiz bir hareket türü girdiniz ...");
            System.out.println(
                    "Geçerli idman isimleri : "
                    + "Burbee\nPushup\nSitup\nSquat");
        }
    }

    public void burbeeYap(int sayi) {
        if (burbeeSayisi == 0) {
            System.out.println("Tebrikler hedeflediğiniz Burbee Sayinizi tamamladınız.");
        }
        if (burbeeSayisi - sayi < 0) {
            System.out.println("Tebrikler hedeflediğiniz Burbee Sayınızı Aştınız .");
            burbeeSayisi = 0;
            System.out.println("Kalan Burbee sayisi = " + burbeeSayisi);
        } else {
            burbeeSayisi -= sayi;
            System.out.println("Kalan Burbee sayisi = " + burbeeSayisi);
        }
    }

    public void squatYap(int sayi) {
        if (sayi == 0) {
            System.out.println("Tebrikler hedeflediğiniz Squat Sayisini tamamladınız . ");
        }
        if (squatSayisi - sayi < 0) {
            System.out.println("Voaovv! Hedeflenilen squat sayinizi Aştınız . ");
            squatSayisi = 0;
            System.out.println("Kalan squat sayisi  = " + squatSayisi);
        } else {
            squatSayisi -= sayi;
            System.out.println("Kalan squat sayisi  = " + squatSayisi);
        }
    }

    public void sitUpYap(int sayi) {
        if (sayi == 0) {
            System.out.println("Tebrikler hedeflediğiniz SitUp Sayisini tamamladınız . ");
        }
        if (situpSayisi - sayi < 0) {
            System.out.println("Voaovv! Hedeflenilen SitUp sayinizi Aştınız . ");
            situpSayisi = 0;
            System.out.println("Kalan SitUp sayisi  = " + situpSayisi);
        } else {
            situpSayisi -= sayi;
            System.out.println("Kalan SitUP sayisi  = " + situpSayisi);
        }
    }

    public void pushUpYap(int sayi) {
        if (sayi == 0) {
            System.out.println("Tebrikler hedeflediğiniz PushUp Sayisini tamamladınız . ");
        }
        if (pushUpSayisi - sayi < 0) {
            System.out.println("Voaovv! Hedeflenilen PushUp sayinizi Aştınız . ");
            pushUpSayisi = 0;
            System.out.println("Kalan PushUp sayisi  = " + pushUpSayisi);
        } else {
            pushUpSayisi -= sayi;
            System.out.println("Kalan PushUP  sayisi  = " + pushUpSayisi);
        }
    }

    public boolean ıdmanBittiMi() {
        return (burbeeSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0) && (pushUpSayisi == 0);
    }

}
