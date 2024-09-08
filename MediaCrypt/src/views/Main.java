package views;
public class Main extends javax.swing.JFrame {
    private static Main instanceMain;
    
    private Main() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static Main getIntanceMain () {
        if (instanceMain == null) {
            instanceMain = new Main();
        }
        
        return instanceMain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSelectExit = new javax.swing.JButton();
        LabelTittle = new javax.swing.JLabel();
        BtnSelectImg = new javax.swing.JButton();
        BtnSelectText = new javax.swing.JButton();
        LabelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Práctica 1 - Criptografía.");
        setBackground(new java.awt.Color(60, 63, 60));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSelectExit.setBackground(new java.awt.Color(102, 102, 255));
        BtnSelectExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSelectExit.setForeground(new java.awt.Color(255, 255, 255));
        BtnSelectExit.setText("Salir");
        BtnSelectExit.setBorderPainted(false);
        BtnSelectExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSelectExit.setFocusable(false);
        BtnSelectExit.setPreferredSize(new java.awt.Dimension(50, 25));
        BtnSelectExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelectExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSelectExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 80, 30));

        LabelTittle.setFont(new java.awt.Font("Consolas", 1, 40)); // NOI18N
        LabelTittle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTittle.setText("MediaCrypt");
        getContentPane().add(LabelTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 220, 60));

        BtnSelectImg.setBackground(new java.awt.Color(255, 255, 255));
        BtnSelectImg.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BtnSelectImg.setForeground(new java.awt.Color(0, 0, 0));
        BtnSelectImg.setText("Imagen");
        BtnSelectImg.setActionCommand("Imagen");
        BtnSelectImg.setFocusable(false);
        BtnSelectImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelectImgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSelectImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 300, 50));

        BtnSelectText.setBackground(new java.awt.Color(255, 255, 255));
        BtnSelectText.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BtnSelectText.setForeground(new java.awt.Color(0, 0, 0));
        BtnSelectText.setText("Texto");
        BtnSelectText.setFocusable(false);
        BtnSelectText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelectTextActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSelectText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 300, 50));

        LabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        LabelBg.setMaximumSize(new java.awt.Dimension(500, 500));
        LabelBg.setMinimumSize(new java.awt.Dimension(300, 300));
        LabelBg.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(LabelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSelectExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelectExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSelectExitActionPerformed

    private void BtnSelectImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelectImgActionPerformed
        ViewText.getInstanceText().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnSelectImgActionPerformed

    private void BtnSelectTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelectTextActionPerformed
        ViewText.getInstanceText().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnSelectTextActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSelectExit;
    private javax.swing.JButton BtnSelectImg;
    private javax.swing.JButton BtnSelectText;
    private javax.swing.JLabel LabelBg;
    private javax.swing.JLabel LabelTittle;
    // End of variables declaration//GEN-END:variables
}
