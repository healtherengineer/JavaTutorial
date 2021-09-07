package beyblade;

public class Dragon extends Beyblade {

    private String kutsalCanavar;

    public Dragon(String beyblader, int saldiriHizi, int donusHizi, String kutsalCanavar) {
        super(beyblader, saldiriHizi, donusHizi);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void bilgiVer() {
        super.bilgiVer();

        System.out.println("Kutsal canavar Ismi : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıCıkart() {

        System.out.println(getBeyblader() + kutsalCanavar + "'ı ortaya cıkarıyor ...");
        System.out.println(getBeyblader() + " ın Saldırısı : Hayalet Kasırgası .");
    }

}
