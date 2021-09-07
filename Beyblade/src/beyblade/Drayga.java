package beyblade;

public class Drayga extends Beyblade {

    private String kutsalCanavar;

    public Drayga(String beyblader, int saldiriHizi, int donusHizi, String kutsalCanavar) {
        super(beyblader, saldiriHizi, donusHizi);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void bilgiVer() {
        super.bilgiVer();
        System.out.println("Kutsal Canavar Ismi : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıCıkart() {

        System.out.println(getBeyblader() + kutsalCanavar + "'ı ortaya cıkarıyor ...");
        System.out.println(getBeyblader() + " ın Saldırısı : Aslan Pencesi");
    }

}
