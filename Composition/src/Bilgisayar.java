
public class Bilgisayar {
    private Kasa kasa;
    private AnaKart anakart;
    private Monitor monitor;

    public Bilgisayar(Kasa kasa, AnaKart anakart, Monitor monitor) {
        this.kasa = kasa;
        this.anakart = anakart;
        this.monitor = monitor;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the anakart
     */
    public AnaKart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(AnaKart anakart) {
        this.anakart = anakart;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
}
