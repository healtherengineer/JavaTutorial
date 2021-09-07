
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public class Kolon extends JPanel
{
    Random rand = new Random();
   private int X = 200; // yandan boşluk
   private int Y = 140;  // üstten boşluk
    @Override
    public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(this.X, this.Y, 50, 50 + rand.nextInt(200)+5); //To change body of generated methods, choose Tools | Templates.
    }
   

  
    
    

    
    
   
   
    
}
