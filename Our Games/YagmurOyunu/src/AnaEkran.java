
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AnaEkran extends JFrame
{

    public AnaEkran(String title) throws HeadlessException
    {
        super(title);
        
        setResizable(false);
        
       // setLocationRelativeTo(this);
        setSize(900, 600);
      //  setLayout(null);// düzgün konumladnırma
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dunya oyunPaneli= new Dunya();
        oyunPaneli.setSize(getSize()); // get size ile mevcut boyutu aldık 900 e 600
        oyunPaneli.setBackground(Color.BLACK);
        oyunPaneli.setLayout(null); //free design
        
        // panel oluşturduk
        
        // 5 tane bağımsız nesnemizi oluşturduk 
         for(int i = 0 ;i<5;i++){
            
            JPanel panel = new JPanel();
            // panel.setBackground(Color.blue);
              panel.setName("Panel"+i);
              panel.setBackground(Color.CYAN);
              
           panel.setBounds(100+i*150, 500, 60, 60); // oluştuklarındaki konumlarını setBounds la veriyoruz
              
              
             oyunPaneli.add(panel);
        }
         
         Hareket hareket = new Hareket(oyunPaneli.getComponents());
         
          oyunPaneli.panelVer(oyunPaneli.getComponents());
            add(oyunPaneli);
            setVisible(true);

    }
    
    
    
    public static void main(String[] args)
    {
      new AnaEkran("Yagmur Oyunu");
        
        
        
    }
    
}
