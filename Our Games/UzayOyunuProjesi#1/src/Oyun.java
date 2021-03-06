
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates{
    
    private int x;
    private int y;

   
    
    public Ates(int x, int y)
    {
        this.x = x;
        this.y = y;
       
    }
    

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
    
}

public class Oyun extends JPanel implements KeyListener,ActionListener
{
    Timer timer = new Timer(1, this);
   
    private BufferedImage image;
    private int gecen_sure = 0;
    private int ates_sayisi = 0 ;
    
    private int atesdirY = 5;
    private int topX = 0;
    private int topdirX =5;
    
    private int uzayGemisiX = 0;
    private int dirUzayX = 20;
    
    ArrayList<Ates> atesler = new ArrayList<Ates>();
    public boolean kontrolEt(){
        
        
        for(Ates ates : atesler){
            if(new Rectangle(ates.getX(), ates.getY(), 10, 20).intersects(new Rectangle(topX,0, 20, 20)) ){
                return true;
            }
           
            
        }
        return false;
    }
    
    public Oyun()
    {
        try
        {
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
            
        } catch (IOException ex)
        {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.BLACK);
        timer.start();
    }

    @Override
    public void repaint()
    {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g)
    {
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        gecen_sure +=1; // ge??en s??re
        g.setColor(Color.red);
        g.fillOval(topX, 0, 20, 20);
        
        //hadiiii image ??izelim
        g.drawImage(image, uzayGemisiX, 490, image.getWidth()/10, image.getHeight()/10, this);
        // ??izdikkkkk
       
        for(Ates ates : atesler){
            if( ates.getY() < 0){
                atesler.remove(ates);
            }
        }
   
         g.setColor(Color.blue);
         
         for(Ates ates : atesler){
             g.fillRect(ates.getX(), ates.getY(), 10, 20);
             
         }
         if(kontrolEt()){
             timer.stop();
             String mesaj = "Tebrikler kazand??n??z ...\n"
                     + "Yap??lan ates say??s?? : " + ates_sayisi+"\n"
                     + "Harcanan s??re : " + gecen_sure /100.0+" saniyedir.";
             JOptionPane.showMessageDialog(this, mesaj);
             System.exit(0);
         }
        
        
    }

    
    
    
    @Override
    public void keyTyped(KeyEvent e)
    {
       
        
            

    
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
         int c=e.getKeyCode(); // nereye bast??????n??n kodu
        if(c == KeyEvent.VK_LEFT){
        
            if(uzayGemisiX <= 0){
                uzayGemisiX = 0;
            }
         
            else{
                uzayGemisiX -=dirUzayX;
                
            }
        }
        else if(c == KeyEvent.VK_RIGHT){
            if(uzayGemisiX >= 750){
                uzayGemisiX = 750;
            }
            else{
                uzayGemisiX +=dirUzayX;
                
            }
        }
        else if(c == KeyEvent.VK_SPACE){
            atesler.add(new Ates(uzayGemisiX+15, 470));
              ates_sayisi++;
            
        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // timer ba??lay??nca art??k her??eyi burda yazar??z
        for(Ates ates : atesler){
           
            
            ates.setY(ates.getY() - atesdirY); // ates var oldu??unda her 5 mili saniyeye bir bir birim yukar?? ??izcez
            
            
            
        }
        
        topX +=topdirX;
        if(topX >= 750){
            topdirX = -topdirX;
            // topdirX -2 oluyor
            
        }
        
        if(topX <= 0){
            topdirX = -topdirX;
            // burda topdirX hala -2 onu +2 yap??yoruz
            
            
        }
        repaint(); // her 5 mili saniye de bir repaint yapcak

    }
    
    
    
    
    
}
