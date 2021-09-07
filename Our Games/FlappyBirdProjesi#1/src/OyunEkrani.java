
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class OyunEkrani extends JPanel implements KeyListener, ActionListener
{
  private int gecilenEngelSayisi = 0;
   
    private int engelDegisim = 5;
    private int topY = 250;
    private int topDegisim = 10;
    private int uretimSuresi = 0;
    Timer timer = new Timer(50, this);
    JLabel skorTabelasi = new JLabel();

    ArrayList<Engel> engeller = new ArrayList<Engel>();

    public OyunEkrani()
    {
        setLayout(null);
        //   skorTabelasi.setFont(new Font("Tohama", 0, 16));
        skorTabelasi.setHorizontalAlignment(SwingConstants.CENTER);
        skorTabelasi.setForeground(Color.BLACK);
        skorTabelasi.setBackground(Color.red);
        skorTabelasi.setOpaque(true); // opaklığı açarsak background özelliği görünür olur 
        skorTabelasi.setBounds(0, 840, 70, 30);
        skorTabelasi.setText("SKOR : " + gecilenEngelSayisi);
        add(skorTabelasi);
        
       

       // timer.start();

    }

    public boolean isOVer()
    {

        Rectangle daire = new Rectangle(50, topY, 30, 30);
        for (Engel engel : engeller)
        {

            Rectangle engel1 = new Rectangle(engel.getGenelX(), engel.getAltY(), engel.getGenelWidth(), engel.getAltHeight());
            Rectangle engel2 = new Rectangle(engel.getGenelX(), engel.getÜstY(), engel.getGenelWidth(), engel.getUstHeight());
            if (daire.intersects(engel1) || daire.intersects(engel2))
            {
                return true;
            }

        }
        return false;

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

        g.setColor(Color.blue);
        g.fillRect(0, 0, 1000, 600);

        g.setColor(Color.green);
        g.fillRect(0, 600, 1000, 240);
        // skor tabelası
        g.fillRect(70, 840, 930, 100);

        g.setColor(Color.RED);
        g.drawLine(0, 600, 1000, 600);

        //top çizdiriyoruz...
        g.fillOval(50, topY, 30, 30);

        for (Engel engel : engeller)
        {

            if (engel.getGenelX() < -20)
            {
                engeller.remove(engel);
                gecilenEngelSayisi += 10;
                skorTabelasi.setText("SKOR : " + gecilenEngelSayisi);

            }
        }

        // engel çizdiriyoruz...
        g.setColor(Color.ORANGE);
        for (Engel engel : engeller)
        {
            g.fillRect(engel.getGenelX(), engel.getÜstY(), engel.getGenelWidth(), engel.getUstHeight());
            g.fillRect(engel.getGenelX(), engel.getAltY(), engel.getGenelWidth(), engel.getAltHeight());
        }


        if (isOVer())
        {
            timer.stop();
            JOptionPane.showMessageDialog(this, "OYUN BİTTİ ! "+ "Skorunuz : " + gecilenEngelSayisi, " Yandınız...", 3);

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
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_UP)
        {
            topY -= (topDegisim + 10);
        }
        

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int c= e.getKeyCode();
        if(c == KeyEvent.VK_ENTER){
            timer.start();
        }
           
        

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        uretimSuresi++;
        if (uretimSuresi == 60)
        {
            engeller.add(new Engel());  // timer arttığı süre boyunca Engel oluşturcak
            uretimSuresi = 0;

        }
        for (Engel engel : engeller)
        {
            //2 defa çıkartiyoruz ki harekattttt hızlansınn
            engel.setGenelX(engel.getGenelX() - engelDegisim);
            engel.setGenelX(engel.getGenelX() - engelDegisim);
        }
        if (topY <= -20 || topY >= 575)
        {
            timer.stop();
        JOptionPane.showMessageDialog(this, "OYUN BİTTİ ! "+"Skorunuz : " + gecilenEngelSayisi, " Yandınız...", 3);
            
            System.exit(0);
        }
        topY += 7;

        repaint();
    }

}
