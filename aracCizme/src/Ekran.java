
import java.awt.Color;
import javax.swing.JFrame;


public class Ekran extends JFrame
{
    Dunya dunya = new Dunya();
    public Ekran (){
        setSize(800, 600);
        setResizable(true);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //panelimizi oluşturduk
       
        //paneli frame oturttuk
       Kolon k1 = new Kolon();
       k1.setBackground(Color.black);
       KolonBottom kb = new KolonBottom();
       Yapı yapı1 = new Yapı(k1,kb);
       
       // kolonu dunyaya ekledik
       dunya.add(k1);
     
    
       
       
         add(dunya);
             setVisible(true);
        
    }
    public static void main(String[] args)
    {
        new Ekran();
        
    }
    
}
