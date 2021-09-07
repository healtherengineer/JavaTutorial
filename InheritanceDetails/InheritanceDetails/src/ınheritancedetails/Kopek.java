
package ınheritancedetails;


public class Kopek  extends Hayvan{
    
    private int dis_sayisi;
    public Kopek(String isim ,int kilo,int boy,int dis_sayisi)
    {
        
        super(isim, kilo, boy);
        this.dis_sayisi = dis_sayisi;
        
    }
    
    //hadi override edelim.
    
    public void hareketEt(int hiz)
    {
        System.out.println("Kopek " +hiz + " km ile hareket ediyor");
        
    }
    //override ettiğim halde super classımın hareket et ini çağırdım.
    public void kos(int hiz)
    {
        System.out.println("Kopek kosuyor...");
      //  super.hareketEt(hiz);
        hareketEt(hiz); // override ettiğim için kopek kpşuyor olur.
    }
    
    
    
}
