
public class FinalTest
{
    private static int say = 0;
    public static final int objeSayisi = 4;
    private final String isim;
    public FinalTest(String isim){
        
        this.isim = isim;
        
//        objeSayisi = ++say;
        
    }

    public int getSay()
    {
        return say;
    }

    public void setSay(int say)
    {
        FinalTest.say = say;
    }
    
    
}
