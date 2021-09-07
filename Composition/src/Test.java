
public class Test {
    
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1980);
        
        Monitor monitor = new Monitor("ASUS", "VS197DE", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "ASUS", "Temperli Cam");
        
        AnaKart anakart = new AnaKart("B250-PRO","ASUS", 12,"Windows 10");
        
        Bilgisayar pc = new Bilgisayar(kasa, anakart, monitor);
        pc.getKasa().bilgisayariAc(); // bilgisayarı açmak için kasa classına
                                    // getKasa() referansıyla erişim sağlayıp ordaki
                                    // bilgisayarıAc methoduna eriştim
        pc.getAnakart().instalOs("Kali Linux");
        // İsletim sistemi kurmak için 
        //GetAnakart referansını kullanarak
        // AnaKart classındaki instalOs methodunu çektim.
        pc.getMonitor().monitorKapat();
        // monitoru kapatmak için 
        // getMonitor referansını kullanarak 
        //Monitor classındaki monitorKapat methodunu çektim.
        
        
        
        
    }
    
}
