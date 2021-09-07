
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author egeba
 */
public class JFileVeJColor extends javax.swing.JFrame
{

    /**
     * Creates new form JFileVeJColor
     */
    public JFileVeJColor()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        dosyaAc = new javax.swing.JButton();
        renkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();
        arkaPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dosyaAc.setText("Dosya Aç");
        dosyaAc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dosyaAcActionPerformed(evt);
            }
        });

        renkButton.setText("Yazı Renk Değiştir");
        renkButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                renkButtonActionPerformed(evt);
            }
        });

        yazi_alani.setColumns(20);
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        arkaPlan.setText("Arka Plan Renk Değiştir");
        arkaPlan.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                arkaPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(dosyaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arkaPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(renkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosyaAc)
                    .addComponent(renkButton))
                .addGap(18, 18, 18)
                .addComponent(arkaPlan)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosyaAcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dosyaAcActionPerformed
    {//GEN-HEADEREND:event_dosyaAcActionPerformed
        JFileChooser fc = new JFileChooser();
        int i = fc.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION)
        {

            File file = fc.getSelectedFile();
            String icerik = "";

            try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file))))
            {

                while (scanner.hasNext())
                {
                    icerik += scanner.nextLine() + "\n";
                }
                yazi_alani.setText(icerik);

            } catch (FileNotFoundException ex)
            {
                Logger.getLogger(JFileVeJColor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_dosyaAcActionPerformed

    private void renkButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_renkButtonActionPerformed
    {//GEN-HEADEREND:event_renkButtonActionPerformed
      Color color = JColorChooser.showDialog(this, "Yazı Rengi ?", Color.yellow);
      yazi_alani.setForeground(color);
    
      
    }//GEN-LAST:event_renkButtonActionPerformed

    private void arkaPlanActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_arkaPlanActionPerformed
    {//GEN-HEADEREND:event_arkaPlanActionPerformed
       Color color1 = JColorChooser.showDialog(this, "Yazı Rengi ?", Color.yellow);

      yazi_alani.setBackground(color1);
    }//GEN-LAST:event_arkaPlanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JFileVeJColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFileVeJColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFileVeJColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFileVeJColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new JFileVeJColor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arkaPlan;
    private javax.swing.JButton dosyaAc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton renkButton;
    private javax.swing.JTextArea yazi_alani;
    // End of variables declaration//GEN-END:variables
}