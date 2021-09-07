
public class arac
{
    
    int hiz =10;
   
   public void hiz_arttir(int degisim)
   {
       this.hiz = hiz+degisim;
       bilgi_hiz();
       
   }
    public void hiz_azalt(int degisim)
   {
       this.hiz = hiz-degisim;
       bilgi_hiz();
       
   }
    public void bilgi_hiz()
    {
        System.out.println("Aracinizin hizi : " + hiz);
    }

  
    
}
