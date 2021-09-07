
public class Araba
{
    String color ; // veri tipi :  string  
    int numberofwheel ; // veri tipi  : numberic
    boolean mars ;    // veri tipi  : boolean
    
    
    public boolean marsaBasildimi(){
        
        if(mars == true){
            System.out.println("Marsa basildi . Araba Çalıştı");
            return true;
            
        }
        else{
            System.out.println("Mars aktif olmadı ... ,Araba ÇAlışmadı .Marş'a basınız lütfen");
            return false;
        }
        
//        if(koşul){
//            yapılacak işlemler...
//        }
//        else{
//            koşul sağlanmadıysa bunu yap!.
//        }
//        
      
    }
    
    
    
}
