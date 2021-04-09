
import java.awt.Color;
import java.awt.Image;
import static java.lang.System.console;
import static java.rmi.server.LogStream.log;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import static javafx.scene.input.KeyCode.R;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author fgedi
 */
public class OtomatEkrani extends javax.swing.JFrame {

  
    public OtomatEkrani() {
        initComponents();
         lblBakiye.setText(" Bakiye: " + Float.toString(bakiye)+ "0 TL");
         lblUrünBakiye.setText("Bakiye: " + Integer.toString(bakiyeUrün)+ "0 TL" ); 
        
        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupPara = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        btnGrupUrün = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblBakiye = new java.awt.Label();
        elliRadio = new javax.swing.JRadioButton();
        birRadio = new javax.swing.JRadioButton();
        besRadio = new javax.swing.JRadioButton();
        onRadio = new javax.swing.JRadioButton();
        btnEkle = new javax.swing.JButton();
        btnEkle1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblUrünBakiye = new java.awt.Label();
        btnUrünEkle = new javax.swing.JButton();
        kolaRadio = new javax.swing.JRadioButton();
        fantaRadio = new javax.swing.JRadioButton();
        gazozRadio = new javax.swing.JRadioButton();
        btnUrünIade = new javax.swing.JButton();
        btnKola = new javax.swing.JButton();
        btnFanta = new javax.swing.JButton();
        btnGazoz = new javax.swing.JButton();

        jDialog1.setModal(true);
        jDialog1.setSize(new java.awt.Dimension(200, 200));
        jDialog1.setType(java.awt.Window.Type.POPUP);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBakiye.setBackground(new java.awt.Color(0, 0, 204));
        lblBakiye.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBakiye.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBakiye.setForeground(new java.awt.Color(255, 255, 255));

        btnGrupPara.add(elliRadio);
        elliRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        elliRadio.setText("0.50 Krş");
        elliRadio.setActionCommand("50");

        btnGrupPara.add(birRadio);
        birRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        birRadio.setText("1 TL");
        birRadio.setActionCommand("1");

        btnGrupPara.add(besRadio);
        besRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        besRadio.setText("5 TL ");
        besRadio.setActionCommand("5");

        btnGrupPara.add(onRadio);
        onRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        onRadio.setText("10 TL");
        onRadio.setActionCommand("10");

        btnEkle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEkle.setText("Para Ekle");
        btnEkle.setActionCommand("btnEkle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnEkle1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEkle1.setText("Para İade");
        btnEkle1.setActionCommand("btnIade");
        btnEkle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(elliRadio)
                        .addGap(28, 28, 28)
                        .addComponent(birRadio)
                        .addGap(37, 37, 37)
                        .addComponent(besRadio)
                        .addGap(18, 18, 18)
                        .addComponent(onRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEkle1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEkle1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elliRadio)
                            .addComponent(birRadio)
                            .addComponent(besRadio)
                            .addComponent(onRadio))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        lblBakiye.getAccessibleContext().setAccessibleName("lblBakiye");
        lblBakiye.getAccessibleContext().setAccessibleDescription("");
        onRadio.getAccessibleContext().setAccessibleName("onRadio");

        lblUrünBakiye.setBackground(new java.awt.Color(255, 51, 51));
        lblUrünBakiye.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnUrünEkle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUrünEkle.setText("ÜRÜN EKLE");
        btnUrünEkle.setActionCommand("btnUrünEkle");
        btnUrünEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrünEkleActionPerformed(evt);
            }
        });

        btnGrupUrün.add(kolaRadio);
        kolaRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        kolaRadio.setText(" KOLA");
        kolaRadio.setActionCommand("15");

        btnGrupUrün.add(fantaRadio);
        fantaRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fantaRadio.setText("FANTA");
        fantaRadio.setToolTipText("");
        fantaRadio.setActionCommand("20");

        btnGrupUrün.add(gazozRadio);
        gazozRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        gazozRadio.setText("GAZOZ");
        gazozRadio.setActionCommand("30");

        btnUrünIade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUrünIade.setText("ÜRÜN İADE");
        btnUrünIade.setActionCommand("btnUrünIade");
        btnUrünIade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrünIadeActionPerformed(evt);
            }
        });

        btnKola.setBackground(java.awt.Color.white);
        btnKola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/kola.png"))); // NOI18N

        btnFanta.setBackground(java.awt.Color.white);
        btnFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/fanta.png"))); // NOI18N

        btnGazoz.setBackground(java.awt.Color.white);
        btnGazoz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/gazoz.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(kolaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKola, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fantaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUrünIade, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGazoz, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(gazozRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUrünEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(lblUrünBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUrünEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUrünIade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(lblUrünBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKola, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(btnFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGazoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fantaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gazozRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kolaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    float bakiye=0;
 
    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        
      
       String secilenPara = btnGrupPara.getSelection().getActionCommand ();
       
        
        switch(secilenPara)
       {
           case "50":
               bakiye = (float) (bakiye + 0.50);
           lblBakiye.setText(" Bakiye: " + Float.toString(bakiye)+ " TL");
               break;
               
           case "1":
               bakiye = (float) (bakiye + 1);
           lblBakiye.setText(" Bakiye: " + Float.toString(bakiye)+ " TL");
               break;
               
           case "5":
               bakiye = (float) (bakiye + 5);
           lblBakiye.setText(" Bakiye: " + Float.toString(bakiye)+ " TL");
               break;
               
           case "10":
               bakiye = (float) (bakiye + 10);
           lblBakiye.setText(" Bakiye: " + Float.toString(bakiye)+ " TL");
               break;
           default:
                JOptionPane.showMessageDialog(this, "Paranız İade Ediliyor","Lütfen Bekleyiniz",JOptionPane.INFORMATION_MESSAGE);            
       }           
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnEkle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkle1ActionPerformed
        
       JOptionPane.showMessageDialog(this, "Paranız İade Ediliyor","Lütfen Bekleyiniz",JOptionPane.INFORMATION_MESSAGE);
        
        bakiye = 0;
        lblBakiye.setText(" Bakiye: " + bakiye + " TL");
    }//GEN-LAST:event_btnEkle1ActionPerformed

    int bakiyeUrün=0;
    private void btnUrünEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrünEkleActionPerformed
        // TODO add your handling code here:
        String secilenUrün = btnGrupUrün.getSelection().getActionCommand();
        
        switch(secilenUrün)
        {
            case "15":
            bakiyeUrün = (int) (bakiyeUrün + 15);
            lblUrünBakiye.setText("Bakiye: " + Integer.toString(bakiyeUrün) + " TL");
            break;
            
             case "20":
            bakiyeUrün = (int) (bakiyeUrün + 20);
            lblUrünBakiye.setText("Bakiye: " + Integer.toString(bakiyeUrün) + " TL");
            break;
            
             case "30":
            bakiyeUrün = (int) (bakiyeUrün + 30);
            lblUrünBakiye.setText("Bakiye: " + Integer.toString(bakiyeUrün) + " TL");
            break;
        }       
        
    }//GEN-LAST:event_btnUrünEkleActionPerformed

    private void btnUrünIadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrünIadeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ürün Silindi","Ürün Bilgisi",JOptionPane.INFORMATION_MESSAGE);
        
        bakiyeUrün = 0;
        lblUrünBakiye.setText(" Bakiye: " + bakiyeUrün + " TL");
    }//GEN-LAST:event_btnUrünIadeActionPerformed
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OtomatEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtomatEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtomatEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtomatEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtomatEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton besRadio;
    private javax.swing.JRadioButton birRadio;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnEkle1;
    private javax.swing.JButton btnFanta;
    private javax.swing.JButton btnGazoz;
    private javax.swing.ButtonGroup btnGrupPara;
    private javax.swing.ButtonGroup btnGrupUrün;
    private javax.swing.JButton btnKola;
    private javax.swing.JButton btnUrünEkle;
    private javax.swing.JButton btnUrünIade;
    private javax.swing.JRadioButton elliRadio;
    private javax.swing.JRadioButton fantaRadio;
    private javax.swing.JRadioButton gazozRadio;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton kolaRadio;
    private java.awt.Label lblBakiye;
    private java.awt.Label lblUrünBakiye;
    private javax.swing.JRadioButton onRadio;
    // End of variables declaration//GEN-END:variables
}
