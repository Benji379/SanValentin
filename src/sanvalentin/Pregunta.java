package sanvalentin;

import javax.swing.JButton;

public class Pregunta extends javax.swing.JFrame {

    public Pregunta() {
        initComponents();
        setLocationRelativeTo(null);
        transparentarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_si = new javax.swing.JButton();
        btn_no = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_si.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_si.png"))); // NOI18N
        btn_si.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_si.png"))); // NOI18N
        btn_si.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_si_2.png"))); // NOI18N
        btn_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siActionPerformed(evt);
            }
        });
        jPanel1.add(btn_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 90));

        btn_no.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_no.png"))); // NOI18N
        btn_no.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_no_2.png"))); // NOI18N
        btn_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_noMouseEntered(evt);
            }
        });
        jPanel1.add(btn_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 110, 90));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siActionPerformed
        pag2 abrirPag2 = new pag2();
        abrirPag2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_siActionPerformed

    boolean cambiarPosicion = false;

    private void btn_noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_noMouseEntered

        if (cambiarPosicion == false) {
            btn_si.setLocation(450, 310);
            btn_no.setLocation(160, 310);
            cambiarPosicion = true;
        } else {
            btn_si.setLocation(160, 310);
            btn_no.setLocation(450, 310);
            cambiarPosicion = false;
        }
    }//GEN-LAST:event_btn_noMouseEntered

    private void btnTransparentes(JButton btn) {
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    }

    private void transparentarBotones() {
        btnTransparentes(btn_si);
        btnTransparentes(btn_no);
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pregunta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_si;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
