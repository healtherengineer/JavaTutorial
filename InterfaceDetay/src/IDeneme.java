
public interface IDeneme
{
  //  private int a = 4;  java interface in içinde private alan kabul etmez
    public int a = 5;  // public alan kabul eder
    
    int c = 7;  // 3 ü de aynı şey
    public static final int b = 6; // zaten public static final int diye yazıyor elle yazmanın manası yok
    
    
    public static void deneme(){
        System.out.println("fonksiyon static olursa okey . Interface in içinde yazabilirim");
        
    }
}
