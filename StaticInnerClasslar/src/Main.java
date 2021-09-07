
public class Main
{
    public static void main(String[] args)
    {
        Matematik.Alan alan = new Matematik.Alan();
        
        alan.daire_alan(6);
        // Static olduğundan referans yardımıyla da çağırabiliriz...
        Matematik.Alan.daire_alan(5);
        // Bu şekilde sınıf ismiyle de fonksiyona ulaşabiliriz...
        
        
        
    }
    
}
