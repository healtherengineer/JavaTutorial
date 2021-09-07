
public class Monitor {
    private String uretici;
    private String model;
    private String boyut ;
    private Resolution resolution;

    public Monitor(String uretici, String model, String boyut, Resolution resolution) {
        this.uretici = uretici;
        this.model = model;
        this.boyut = boyut;
        this.resolution = resolution;
    }
public void monitorKapat()
{
    System.out.println("Monitor kapatılıyor...");
}
    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
    
}
