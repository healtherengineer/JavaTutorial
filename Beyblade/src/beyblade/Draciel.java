
package beyblade;


public class Draciel extends Beyblade {

    private String kutsalCanavar;
    
    public Draciel(String beyblader, int saldiriHizi, int donusHizi,String kutsalCanavar) {
        super(beyblader, saldiriHizi, donusHizi);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgiVer() {
        super.bilgiVer(); 
        System.out.println("Kutsal Canavarın Ismi : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıCıkart() {
        System.out.println(getBeyblader() + kutsalCanavar + "'ı ortaya cıkarıyor ...");
        System.out.println(getBeyblader() + " ın Savunması : Kale Savunması . ");
        
    }
    
    
    
    
    
    
}
