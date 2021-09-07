package beyblade;

public class Beyblade {

    private String beyblader;
    private int saldirGucu;
    private int donusHizi;

    public Beyblade(String beyblader, int saldiriHizi, int donusHizi) {
        this.beyblader = beyblader;
        this.saldirGucu = saldiriHizi;
        this.donusHizi = donusHizi;
    }

    public String getBeyblader() {
        return beyblader;
    }

    public void setBeyblader(String beyblader) {
        this.beyblader = beyblader;
    }

    public int getSaldiriHizi() {
        return saldirGucu;
    }

    public void setSaldiriHizi(int saldiriHizi) {
        this.saldirGucu = saldiriHizi;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public void saldiri() {
        System.out.println(beyblader + " " + " ci " + donusHizi + "Donus Hizi ve " + saldirGucu + " ile saldirdi...");
    }

    public void kutsalCanavarıCıkart() {
        System.out.println("Bu beyblader'ın kutsal canavarı bulunmamaktadır...");

    }

    public void bilgiVer() {
        System.out.println("Beyblader Ismi : " + this.beyblader);
        System.out.println("Beyblader'ın Donus Hizi : " + this.donusHizi);
        System.out.println("Beyblader'ın Saldiri Hizi : " + this.saldirGucu);

    }
}
