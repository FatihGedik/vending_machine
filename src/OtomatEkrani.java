import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OtomatEkrani extends javax.swing.JFrame {
  
    public OtomatEkrani() {
        initComponents();
         lblBakiye.setText(" Bakiye: " + Double.toString(bakiye)+ "0 TL");
         lblUrunBakiye.setText(" Ürün Fiyatı: " + Double.toString(urunFiyat)+ "0 TL" );         
        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lblBakiye = new java.awt.Label();
        btnParaIade = new javax.swing.JButton();
        btnElliKrs = new javax.swing.JButton();
        btnBirTl = new javax.swing.JButton();
        btnBesTl = new javax.swing.JButton();
        btnOnTl = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblUrunBakiye = new java.awt.Label();
        btnUrunEkle = new javax.swing.JButton();
        btnUrunIade = new javax.swing.JButton();
        btnKola = new javax.swing.JButton();
        btnFanta = new javax.swing.JButton();
        btnGazoz = new javax.swing.JButton();
        lblKola = new java.awt.Label();
        lblFanta = new java.awt.Label();
        lblGazoz = new java.awt.Label();

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

        btnParaIade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnParaIade.setText("Para İade");
        btnParaIade.setActionCommand("btnIade");
        btnParaIade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaIadeActionPerformed(evt);
            }
        });

        btnElliKrs.setBackground(java.awt.Color.white);
        btnElliKrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/50.png"))); // NOI18N
        btnElliKrs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElliKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElliKrsMouseClicked(evt);
            }
        });

        btnBirTl.setBackground(java.awt.Color.white);
        btnBirTl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/1.png"))); // NOI18N
        btnBirTl.setToolTipText("");
        btnBirTl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBirTlMouseClicked(evt);
            }
        });

        btnBesTl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/5.png"))); // NOI18N
        btnBesTl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBesTlMouseClicked(evt);
            }
        });

        btnOnTl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/10.png"))); // NOI18N
        btnOnTl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOnTlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBesTl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElliKrs, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOnTl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBirTl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnParaIade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnElliKrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBirTl, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBesTl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOnTl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnParaIade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        lblBakiye.getAccessibleContext().setAccessibleName("lblBakiye");
        lblBakiye.getAccessibleContext().setAccessibleDescription("");

        lblUrunBakiye.setBackground(new java.awt.Color(255, 51, 51));
        lblUrunBakiye.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnUrunEkle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUrunEkle.setText("SATIN AL");
        btnUrunEkle.setActionCommand("btnUrünEkle");
        btnUrunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunEkleActionPerformed(evt);
            }
        });

        btnUrunIade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUrunIade.setText("ÜRÜN İADE");
        btnUrunIade.setActionCommand("btnUrünIade");
        btnUrunIade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunIadeActionPerformed(evt);
            }
        });

        btnKola.setBackground(java.awt.Color.white);
        btnKola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/kola.png"))); // NOI18N
        btnKola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKolaMouseClicked(evt);
            }
        });

        btnFanta.setBackground(java.awt.Color.white);
        btnFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/fanta.png"))); // NOI18N
        btnFanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFantaMouseClicked(evt);
            }
        });

        btnGazoz.setBackground(java.awt.Color.white);
        btnGazoz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/gazoz.png"))); // NOI18N
        btnGazoz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGazozMouseClicked(evt);
            }
        });

        lblKola.setAlignment(java.awt.Label.CENTER);
        lblKola.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKola.setText("KOLA : 15 TL");

        lblFanta.setAlignment(java.awt.Label.CENTER);
        lblFanta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFanta.setText("FANTA : 20 TL");

        lblGazoz.setAlignment(java.awt.Label.CENTER);
        lblGazoz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGazoz.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGazoz.setText("GAZOZ : 30 TL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKola, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUrunIade, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGazoz, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGazoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUrunEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUrunBakiye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUrunEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUrunIade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(lblUrunBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKola, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(btnFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGazoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKola, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(lblFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGazoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    double bakiye = 0;
    double paraBirim = 0;
    int urunFiyat = 0;
            
    private void btnParaIadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaIadeActionPerformed
      Object[] txtConfirmButton = {"Evet", "Hayır"};
      Object defaultSecenek = txtConfirmButton[0];

        if (bakiye != 0) {
            if (JOptionPane.showOptionDialog(this,
             "Paranız İade Edilecek Onaylıyor Musunuz?",
             "İade Onay",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE,
             null,
             txtConfirmButton,
             defaultSecenek) == JOptionPane.YES_OPTION) {          
            JOptionPane.showMessageDialog(this, "Paranız İade Ediliyor","Lütfen Bekleyiniz",JOptionPane.INFORMATION_MESSAGE);
        }
        }

             
        
        bakiye = 0;
        lblBakiye.setText(" Bakiye: 0.00 TL");
    }//GEN-LAST:event_btnParaIadeActionPerformed

    private void btnUrunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunEkleActionPerformed
        
        if (urunFiyat == 0) {
            JOptionPane.showMessageDialog(this, "Lütfen Ürün Seçiniz","Ürün Seçilmedi",JOptionPane.WARNING_MESSAGE);
       return;
        }        
         if (urunFiyat > bakiye) {
            JOptionPane.showMessageDialog(this, "Lütfen Para Ekleyiniz.","Yetersiz Bakiye",JOptionPane.WARNING_MESSAGE);
        return;
         }         
        bakiye = bakiye - urunFiyat;
        lblBakiye.setText(" Bakiye: " + Double.toString(bakiye)+ " TL");
         JOptionPane.showMessageDialog(this, "Ürününüz Hazırlanıyor. Lütfen Bekleyiniz.",
                 "Ürününüz Hazırlanıyor.",
                 JOptionPane.OK_OPTION);      
        urunFiyat = 0 ;
        lblUrunBakiye.setText("Ürün Fiyatı: 0.00 TL");                
    }//GEN-LAST:event_btnUrunEkleActionPerformed

    private void btnUrunIadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunIadeActionPerformed
        if (urunFiyat != 0) {
          JOptionPane.showMessageDialog(this, "Ürün Silindi","Ürün Bilgisi",JOptionPane.INFORMATION_MESSAGE);      
        }
        
        urunFiyat = 0;
        lblUrunBakiye.setText(" Ürün Fiyatı: 0.00 TL");
    }//GEN-LAST:event_btnUrunIadeActionPerformed

    private void btnKolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKolaMouseClicked
        
        urunFiyat = 0;
        urunFiyat = 15;
        lblUrunBakiye.setText("Ürün Fiyatı: 15 TL");
    }//GEN-LAST:event_btnKolaMouseClicked

    private void btnFantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFantaMouseClicked
        
        urunFiyat = 0;
        urunFiyat = 20;
        lblUrunBakiye.setText("Ürün Fiyatı: 20 TL");
    }//GEN-LAST:event_btnFantaMouseClicked

    private void btnGazozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGazozMouseClicked
       
        urunFiyat = 0;
        urunFiyat = 30;
        lblUrunBakiye.setText("Ürün Fiyatı: 30 TL");
    }//GEN-LAST:event_btnGazozMouseClicked

    private void btnElliKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElliKrsMouseClicked
        
        paraBirim = 0;
        paraBirim  = 0.50;        
        bakiye = (double) (bakiye + 0.50);
        lblBakiye.setText(" Bakiye: " + Double.toString(bakiye)+ " TL");
    }//GEN-LAST:event_btnElliKrsMouseClicked

    private void btnBirTlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBirTlMouseClicked
        
        paraBirim = 0 ;
        paraBirim = 1;
        bakiye = (double) (bakiye + 1);
        lblBakiye.setText(" Bakiye: " + Double.toString(bakiye)+ " TL");
    }//GEN-LAST:event_btnBirTlMouseClicked

    private void btnBesTlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBesTlMouseClicked
       
        paraBirim = 0 ;
        paraBirim = 5;        
        bakiye = (double) (bakiye + 5);
        lblBakiye.setText(" Bakiye: " + Double.toString(bakiye)+ " TL");
    }//GEN-LAST:event_btnBesTlMouseClicked

    private void btnOnTlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOnTlMouseClicked
       
        paraBirim = 0 ;
        paraBirim = 10;        
        bakiye = (double) (bakiye + 10);
        lblBakiye.setText(" Bakiye: " + Double.toString(bakiye)+ " TL");
    }//GEN-LAST:event_btnOnTlMouseClicked
 
    public static void main(String args[]) {
        
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
    private javax.swing.JButton btnBesTl;
    private javax.swing.JButton btnBirTl;
    private javax.swing.JButton btnElliKrs;
    private javax.swing.JButton btnFanta;
    private javax.swing.JButton btnGazoz;
    private javax.swing.JButton btnKola;
    private javax.swing.JButton btnOnTl;
    private javax.swing.JButton btnParaIade;
    private javax.swing.JButton btnUrunEkle;
    private javax.swing.JButton btnUrunIade;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label lblBakiye;
    private java.awt.Label lblFanta;
    private java.awt.Label lblGazoz;
    private java.awt.Label lblKola;
    private java.awt.Label lblUrunBakiye;
    // End of variables declaration//GEN-END:variables
}
