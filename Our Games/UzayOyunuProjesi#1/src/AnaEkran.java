
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran extends JFrame
{  

    public AnaEkran(String title) throws HeadlessException
    {
        super(title);
    }
    
    public static void main(String[] args)
    {
        
        AnaEkran ekran = new AnaEkran("Uzay Oyunu");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        //ekran.setLocationRelativeTo(this);
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        
        oyun.requestFocus(); // focus için istekte bulunuyor
        
        oyun.addKeyListener(oyun); // klavye işlemleri için izin istiyor
        
        oyun.setFocusable(true); // focusu odağı yani jpanel aldı
        oyun.setFocusTraversalKeysEnabled(false);  // tuşları algılama 
        
        ekran.add(oyun);  // frame e panel eklendi
        
        ekran.setVisible(true); // artık ekran gözükebilir.
        
        
        
        
        
        
    }
    
}
