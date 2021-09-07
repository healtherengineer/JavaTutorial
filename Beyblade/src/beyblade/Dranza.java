package beyblade;

public class Dranza extends Beyblade {

    private String kutsalCanavar;

    public Dranza(String beyblader, int saldiriHizi, int donusHizi, String kutsalCanavar) {
        super(beyblader, saldiriHizi, donusHizi);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgiVer() {
        super.bilgiVer();
        System.out.println("Kutsal Canavarın Adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıCıkart() {
        System.out.println(getBeyblader() + " " + kutsalCanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeyblader() + " ın Saldırısı : Alev Kılıcı");
    }

}
