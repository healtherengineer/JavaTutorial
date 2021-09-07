import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener {

    public Line2D line2d;
    public Polygon pol;
    public int x1 = 40;
    public int y1 = 0;
    public int x2 = 400;
    public int y2 = 400;
    public int margin = 3;
    private int X ;
    private int Y;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(new MyPanel());
        frame.pack();
        frame.setVisible(true);
    }

    public MyPanel(){

        setBackground(Color.black);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4.0F));
        line2d = new Line2D.Double(x1, y1, x2, y2);
        g2.draw(line2d);
        int xPoints[] = { x1 - margin, x1 + margin, x2 + margin, x2 - margin };
        int yPoints[] = { y1 + margin, y1 - margin, y2 - margin, y2 + margin };
        pol = new Polygon(xPoints, yPoints, yPoints.length);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (pol.contains(e.getX(), e.getY())) {
          
          
        }
        else{
       
                
        }
     
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
     
        
        X = e.getX();
        Y = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}