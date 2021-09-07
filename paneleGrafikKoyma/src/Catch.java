import java.awt.*;
import javax.swing.*;

   // panelin içine grafik koyma
public class Catch {

    public class MyGraphics extends JComponent {

        private static final long serialVersionUID = 1L;

        MyGraphics() {
            setPreferredSize(new Dimension(500, 600));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.yellow);
            g.fillRect(200, 62, 30, 10);
            
            g.fillOval(200, 150, 40, 40);
        }
    }

    public void createGUI() {
        final JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.add(new MyGraphics());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Catch GUI = new Catch();
                GUI.createGUI();
            }
        });
    }
}