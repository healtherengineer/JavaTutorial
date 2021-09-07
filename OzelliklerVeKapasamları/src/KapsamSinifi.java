
public class KapsamSinifi
{
    private  int privateDegisken = 30;
    
    public KapsamSinifi(){
        System.out.println("private değişken = " + privateDegisken);
        
    }
    
    public void onileCarp(){
        
        int privateDegisken = 10;  // unused olur 
        for(int i = 1 ; i < 6 ; i++){
            
            System.out.println(i +" * " + this.privateDegisken + " = " + (this.privateDegisken*i));
            
        }
        
    }
    
    
}
