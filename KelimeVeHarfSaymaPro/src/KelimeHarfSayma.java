
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author egeba
 */
public class KelimeHarfSayma extends javax.swing.JFrame
{

    @Override
    public void paint(Graphics g)
    {
       
        getContentPane().setBackground(Color.GREEN);
    }
    

    /**
     * Creates new form KelimeHarfSayma
     */
    public KelimeHarfSayma()
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();
        hesaplaButton = new javax.swing.JButton();
        kelime_sayisi_alani = new javax.swing.JLabel();
        harf_sayisi_alani = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("  Kelime ve Harf Sayma");
        setBackground(new java.awt.Color(24, 40, 240));

        yazi_alani.setBackground(new java.awt.Color(211, 211, 211));
        yazi_alani.setColumns(20);
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        hesaplaButton.setBackground(new java.awt.Color(51, 255, 255));
        hesaplaButton.setForeground(new java.awt.Color(255, 0, 0));
        hesaplaButton.setText("Kelime ve Harf Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hesaplaButtonActionPerformed(evt);
            }
        });

        kelime_sayisi_alani.setBackground(new java.awt.Color(0, 0, 51));
        kelime_sayisi_alani.setText("Kelime Sayısı : ");

        harf_sayisi_alani.setText("Harf Sayısı :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(hesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(kelime_sayisi_alani)
                        .addGap(116, 116, 116)
                        .addComponent(harf_sayisi_alani)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelime_sayisi_alani)
                    .addComponent(harf_sayisi_alani))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(hesaplaButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hesaplaButtonActionPerformed
    {//GEN-HEADEREND:event_hesaplaButtonActionPerformed
        String yazi= yazi_alani.getText();
        int kelimeSayisi=0;
        int harfSayisi= 0;
        for(int i=0;i<yazi.length();i++){
           if(yazi.charAt(i) != ' '){
               harfSayisi++;
           }
        }
        
     String[] yazi2 = yazi.split(" "); // boşluğa göre ayırdı
     for(int i=0;i<yazi2.length;i++){
         kelimeSayisi++;
         
     }
    kelime_sayisi_alani.setText("Kelime Sayısı : " + kelimeSayisi);
    harf_sayisi_alani.setText("Karakter Sayısı : " + harfSayisi);
        
    }//GEN-LAST:event_hesaplaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KelimeHarfSayma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(KelimeHarfSayma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(KelimeHarfSayma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(KelimeHarfSayma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new KelimeHarfSayma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel harf_sayisi_alani;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kelime_sayisi_alani;
    private javax.swing.JTextArea yazi_alani;
    // End of variables declaration//GEN-END:variables
}