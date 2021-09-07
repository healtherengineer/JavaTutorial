
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Dunya extends JPanel implements ActionListener
{
    Random r = new Random();
    Timer timer = new Timer(50, this);
    private int ballX =(int) (25 + r.nextDouble()*830);
    private int ballY = 0;
    private int ballDegisim = 15;
    JPanel paneller[] = new JPanel[5];
    
    private int skor = 0;

    public Dunya()
    {
        timer.start();
    }
 
    // butun içerikleri alacaz
    
    public void panelVer(Component[] cmop)
    {
        int i = 0;
        
        for(Component c : cmop){
            paneller[i] =(JPanel) c; // referans atama !!!
            i++;
        }
    }
    
    public boolean isOver()
    {
        Rectangle ball = new Rectangle(ballX, ballY, 15, 15);
        
        for (JPanel p : paneller)
        {
            Rectangle panel = new Rectangle(p.getX(), p.getY(), p.getWidth(), p.getHeight());
            
            if (ball.intersects(panel))
            {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g); 
        g.setColor(Color.red);
        g.fillOval(ballX, ballY, 15, 15);
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        
        if (ballY > 600)
        {
            skor++;
            ballY = 0;
            ballX =(int) (25 + r.nextDouble()*830);
        }
        
        if (isOver() == true)
        {
            JOptionPane.showMessageDialog(this, "Game Over \nSkor : " + skor);
            System.exit(0);
        }
        
        ballY += ballDegisim;
        
        
        
        
        
        repaint();
    }
    
    
}
