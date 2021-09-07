
package com.ege.swingornegi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //swing deki herşey
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pencere{
    
    private JFrame frame;
    private JLabel label = new JLabel();
   private int i=0;
    
    public Pencere(){
        
        frame = new JFrame("Hello");
        
        JButton button = new JButton("Tıkla");
        
        button.setBounds(130, 100, 100, 40);
        label.setBounds(130, 50, 100, 50);
        label.setForeground(Color.red);
        label.setBackground(Color.black);
    //    label.setOpaque(true);
        frame.add(label);
        button.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
               
                label.setText (++i+" kere tıkladınız...");
               // System.out.println("Tıkladınız...");
            }
        });
        
        frame.add(button);
        
        frame.setSize(400, 500);
        
        frame.setLayout(null);
        
        frame.setLocationRelativeTo(null);
        
        frame.setResizable(false);
        
         frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        frame.setVisible(true);
    }
    
    
    
}

