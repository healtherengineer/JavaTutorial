
public class Matematik
{
    
    public  static class Alan{
       
        private static double pi = Math.PI; // static bir method icinde kullanacaksam static olmalı !!!
// static olmayan bir inner class da static bir method yazamıyorum

        public static double getPi()
        {
            return pi;
        }
    
        
        public static void  daire_alan(int yaricap){
            
            
            
            System.out.println("Dairenin alan'ı : " + (yaricap*yaricap*getPi()));
            
            
        }
        
        
        
        
    }
    
    
}
