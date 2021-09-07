
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;


public class Hareket implements MouseListener,MouseMotionListener
{
    private int X ;
    private int Y;

    
    Hareket(Component[] panel)
    {
        for(Component bilesen : panel){
            bilesen.addMouseListener(this);
            bilesen.addMouseMotionListener(this);
         
            
        }
       
        
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        X = e.getX();
        Y = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        // üstünde olduğum componentin locationunu mousein sürüklenmesine bağlı olarak değiştir sürekli
        e.getComponent().setLocation((e.getComponent().getX() - X ) + e.getX()  ,  e.getComponent().getY() - Y + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
    }
    
    
}
