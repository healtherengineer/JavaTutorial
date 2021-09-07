
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran extends JFrame
{
  
    public AnaEkran(String title) throws HeadlessException {
        super(title);
      
    }
    
    public static void main(String[] args)
    {
        GrafikKullanimi grafik = new GrafikKullanimi();
        
        AnaEkran ekran = new AnaEkran("Oyun Ekranı");
        
        ekran.setVisible(true);
        ekran.setSize(800, 800);
        ekran.setLocationRelativeTo(null);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // çarpıya basınca kapansın
        ekran.setResizable(false); // yanlardan çekilemesin 
        ekran.add(grafik);
        
        
        
    }

  
}
