
import java.io.IOException;


public class Main
{
    public static void ucuncu(){
        try{
            int a = 12/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            
            System.out.println("Aritmetik bir exception yakalandı...");
        }
 
        
    }
    public static void ikinci(){
        ucuncu();
        System.out.println("ikinci");
    }
    public static void birinci()
    {
        ikinci();
        System.out.println("birinci");
    }
    public static void main(String[] args)
    {
        
        birinci();
        System.out.println("follow code");
        
        
    }
    
}
