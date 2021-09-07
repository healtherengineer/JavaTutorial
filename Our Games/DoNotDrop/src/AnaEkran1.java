
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran1 extends JFrame
{

    public AnaEkran1(String title) throws HeadlessException
    {
        super(title);
        
     
    }
    
    public static void main(String[] args)
    {
        AnaEkran1 ekran = new AnaEkran1("Don't Drop");
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(700, 900);
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun1 oyun  = new Oyun1();
        
        oyun.requestFocus();
        
        oyun.addKeyListener(oyun); // implemente edecem keylistener ve action listeneri
        
        oyun.setFocusable(true);
        
        oyun.setFocusTraversalKeysEnabled(false);
        
        ekran.add(oyun);
        
        ekran.setVisible(true);
        
        
        
        
    }
    
}
