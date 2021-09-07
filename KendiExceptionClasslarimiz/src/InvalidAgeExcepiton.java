
import java.io.IOException;


public class InvalidAgeExcepiton extends IOException
{
    public InvalidAgeExcepiton (String message){
        super(message);
        
    }

    @Override
    public void printStackTrace()
    {
       
        System.out.println("Bir tane Invalid Age hatası fırlatıldı...");
    }
    
    
    
    
    
    
}
