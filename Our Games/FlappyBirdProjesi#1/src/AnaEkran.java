
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AnaEkran extends JFrame
{

    public AnaEkran(String title) throws HeadlessException
    {
        super(title);
        //  setLocationRelativeTo(null);

    }

    public static void main(String[] args)
    {
//            int x = JOptionPane.showConfirmDialog(null, "Başlamaya Hazır mısınız ? ", "Başla", 0);
//            
//        if (x == JOptionPane.NO_OPTION)
//        {
//            System.exit(0);
//        }

        AnaEkran ekran = new AnaEkran("Flappy Bird");

        ekran.setResizable(false);
        ekran.setFocusable(false);

        ekran.setSize(1000, 900);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setLocationRelativeTo(null);

        OyunEkrani oyun = new OyunEkrani();

        oyun.requestFocus(); // focus için istekte bulunuyor

        oyun.addKeyListener(oyun); // klavye işlemleri için izin istiyor

        oyun.setFocusable(true); // focusu odağı yani jpanel aldı
        oyun.setFocusTraversalKeysEnabled(false);  // tuşları algılama 

        ekran.add(oyun);  // frame e panel eklendi
       

        ekran.setVisible(true); // artık ekran gözükebilir.
      
        JOptionPane.showMessageDialog(oyun, "Başlamak İçin Enter'a basınız !", "Oyun Başlıyor...", 1, null);
        

    }

}
