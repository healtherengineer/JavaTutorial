
package beyblade;


public class BeybladeFabrikasi {
    
    public Beyblade beybladeYap(String beybladeIsmi)
    {
        if(beybladeIsmi.equalsIgnoreCase("Dragon"))
        {
          return new Dragon("Takao", 800, 300, "Kutsal Canavarla Konusma");
        }
        else if(beybladeIsmi.equalsIgnoreCase("Dranza"))
        {
            return new Dranza("Kai", 600, 400, "Kirmizi Anka Kusu");
            
        }
           else if(beybladeIsmi.equalsIgnoreCase("Drayga"))
        {
            return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
            
        }
           else if(beybladeIsmi.equalsIgnoreCase("Draciel"))
        {
           return new Draciel("Max",400,1000,"Kara Kaplumbağa");
            
        }
        else
           {
               return null;
           }
        
        
        
        
    }
    
}
