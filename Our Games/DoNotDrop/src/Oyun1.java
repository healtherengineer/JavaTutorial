
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Oyun1 extends JPanel implements KeyListener, ActionListener
{
    private int baslangıcTimer=15;
    private int skor=0;
    Timer timer = new Timer(baslangıcTimer, this);

   

    Random rand = new Random();
    private int kutuX = 0;
    private int dirkutuX =15;
    
    

    private int balonX = rand.nextInt(670) +5;
    
    private int dirbalonY=5; //her 70 de 1
    private int balonY=0;
    public boolean oyunBitirKontrol(){
        
                if(new Rectangle(0, 700, 700, 700).intersects(new Rectangle(balonX, balonY, 25, 25))){
                    return true;
                    
                }
                else
                {
                    return false;
                }

    }
   
    public boolean kontrolEt(){
        
        if(new Rectangle(kutuX, 650, 70, 50).intersects(new Rectangle(balonX, balonY, 25, 25)))
        {
            return false;
        }
        else{
            return true;
        }
        
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
       
        

        g.setColor(Color.RED);

        g.drawLine(0, 700, 700, 700);

        g.setColor(Color.BLUE);

        g.fillRect(kutuX, 650, 70, 50);

        g.setColor(Color.yellow);
        if(balonY>700){
            balonX=rand.nextInt(670)+5;
            balonY=0;
        }

        g.fillOval(balonX, balonY, 25, 25);
        if(!kontrolEt()){
          
            //puan al 
            
            skor+=10;
               balonX=rand.nextInt(670)+5;
            balonY=0;
            
            if(skor >=3){
                baslangıcTimer -=2;
                
            }
        }
        if(oyunBitirKontrol()){
            //oyun bitirici kontrol!!!
            timer.stop();
            String mesaj ="Oyun Bitti...\n"
                    + "Yakalanan Balon Sayısı : " +skor/10+"\n"
                    +"Skorunuz : " +skor;
            JOptionPane.showMessageDialog(this, mesaj);
            System.exit(0);
        }
        
        

    }
     @Override
    public void repaint()
    {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    public Oyun1()
    {
        setBackground(Color.BLACK);
    
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int c= e.getKeyCode();
        if(c==KeyEvent.VK_RIGHT){
            
            if(kutuX >= 625){
                kutuX=625;
            }
            else
            {
                kutuX +=dirkutuX;
            }
            
        }
        else if(c==KeyEvent.VK_LEFT){
            
            if(kutuX <=0){
                kutuX = 0;
            }
            else{
                kutuX -=dirkutuX;
            }
            
        }

        
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
                int c= e.getKeyCode();

                if(c==KeyEvent.VK_ENTER){
                                timer.start();

                    
                }

    }

  //  private int i=1;
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // nesneyi düşürelim 
        
        balonY +=dirbalonY;
//        if(skor>=70){
//            i++;
//            dirbalonY +=1;
//        }
        repaint();

    }

}
