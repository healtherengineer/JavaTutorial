
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author egeba
 */
public class GrafikKullanimi extends JPanel
{
    // paint le şekillerimizi panel üzerinde çizelim
    

    @Override
    public void paint(Graphics g)
    {
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
     //  g.draw3DRect(100, 50, 300, 60, true);
         
          g.setColor(Color.red);
        g.drawRect(100, 50, 100, 50);
        g.setColor(Color.blue);
        g.fillRect(100, 150, 100, 50);
        g.setColor(Color.YELLOW);
        
        g.drawRect(400, 50, 100, 100);
        g.setColor(Color.blue);
        g.fillRect(400, 200, 100, 100);
        g.setColor(Color.GREEN);
        g.drawOval(400, 400, 100, 100);
                g.setColor(Color.pink);
                g.fillOval(400, 600, 100, 100);
                g.setColor(Color.red);
                g.drawLine(0, 0, 800, 765);
                g.setColor(Color.BLUE);
                g.drawLine(200, 0, 200, 800);
                
                 g.setColor(Color.BLUE);
                g.drawLine(400, 0, 400, 800);
                 g.setColor(Color.BLUE);
                g.drawLine(600, 0, 600, 800);
                 g.setColor(Color.BLUE);
                g.drawLine(800, 0, 800, 800);

        
        
    }

    public GrafikKullanimi()
    {
        // kurucu method ile panel ilk açıldığında backgraound u siyah olacak
        
        setBackground(Color.black);
    }
    
    
    
}
