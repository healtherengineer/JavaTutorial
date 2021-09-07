
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author egeba
 */
public class SiparisUygulamasi extends javax.swing.JFrame
{

    private Map<String, Integer> siparisler = new LinkedHashMap<String, Integer>();

    /**
     * Creates new form SiparisUygulamasi
     */
    public SiparisUygulamasi()
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

        jLabel1 = new javax.swing.JLabel();
        kebap = new javax.swing.JCheckBox();
        kusbasi = new javax.swing.JCheckBox();
        sumak = new javax.swing.JCheckBox();
        salgam = new javax.swing.JCheckBox();
        siparis_goster_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yağlar Kebap");

        jLabel1.setText("MENÜ");

        kebap.setText("Adana Kebap - 20 TL");

        kusbasi.setText("Kuşbaşı - 18 TL");

        sumak.setText("Sumak Salatası - 7 TL");

        salgam.setText("Şalgam - 3 TL");

        siparis_goster_button.setText("Siparişleri Göster");
        siparis_goster_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                siparis_goster_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siparis_goster_button, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(salgam)
                        .addComponent(sumak)
                        .addComponent(kusbasi)
                        .addComponent(kebap)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kebap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kusbasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salgam)
                .addGap(48, 48, 48)
                .addComponent(siparis_goster_button)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void siparisleriGöster()
    {
        String message = "";
        int tutar = 0;
        if (siparisler.isEmpty())
        {
            message += "Siparişiniz Bulunmamaktadır !";
        }
        else
        {
            for (Map.Entry<String, Integer> entry : siparisler.entrySet())
            {
                message +=entry.getKey() + "\n";
                tutar +=entry.getValue();
            }
            message +="Toplam Hesabınız : " + tutar;

        }
        
        
        
        
        JOptionPane.showMessageDialog(this, message);
        
        
        
    }
    private void siparis_goster_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_siparis_goster_buttonActionPerformed
    {//GEN-HEADEREND:event_siparis_goster_buttonActionPerformed

        if (kebap.isSelected())
        {
            siparisler.put("Adana Kebap", 20);

        }
        else
        {
            siparisler.remove("Adana Kebap");
        }
        if (kusbasi.isSelected())
        {
            siparisler.put("Kuşbaşı", 18);

        }
        else
        {
            siparisler.remove("Kuşbaşı");
        }
        if (sumak.isSelected())
        {
            siparisler.put("Sumak Salatası", 7);

        }
        else
        {
            siparisler.remove("Sumak Salatası");
        }
        if (salgam.isSelected())
        {
            siparisler.put("Şalgam", 3);

        }
        else
        {
            siparisler.remove("Şalgam");
        }
        siparisleriGöster();
    }//GEN-LAST:event_siparis_goster_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SiparisUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox kebap;
    private javax.swing.JCheckBox kusbasi;
    private javax.swing.JCheckBox salgam;
    private javax.swing.JButton siparis_goster_button;
    private javax.swing.JCheckBox sumak;
    // End of variables declaration//GEN-END:variables
}