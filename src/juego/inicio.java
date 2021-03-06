/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.applet.AudioClip;
/**
 *
 * @author Isaac Bustamante y Fernando Cota
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/ringtones-the-avengers.wav"));
        sonido.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDificil = new javax.swing.JButton();
        btnMedio = new javax.swing.JButton();
        btnFacil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDificil.setBackground(new java.awt.Color(102, 0, 102));
        btnDificil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDificil.setForeground(new java.awt.Color(255, 255, 255));
        btnDificil.setText("Dificil");
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });
        getContentPane().add(btnDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 120, 60));

        btnMedio.setBackground(new java.awt.Color(102, 0, 102));
        btnMedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnMedio.setText("Medio");
        btnMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedioActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 120, 60));

        btnFacil.setBackground(new java.awt.Color(102, 0, 102));
        btnFacil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFacil.setForeground(new java.awt.Color(255, 255, 255));
        btnFacil.setText("Facil");
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        playGame3 gameDificil = new playGame3();
        gameDificil.setVisible(true);
    }//GEN-LAST:event_btnDificilActionPerformed

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        playGame1 gameFacil = new playGame1();
        gameFacil.setVisible(true);
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedioActionPerformed
        playGame2 gameMedio = new playGame2();
        gameMedio.setVisible(true);
    }//GEN-LAST:event_btnMedioActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnMedio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
