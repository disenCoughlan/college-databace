/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author disen
 */
public class question3 extends javax.swing.JFrame {

    /**
     * Creates new form question3
     */
    public question3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lblname = new javax.swing.JLabel();
        Txtname = new javax.swing.JTextField();
        LblPass = new javax.swing.JLabel();
        TxtPass = new javax.swing.JTextField();
        LblStudentNum = new javax.swing.JLabel();
        TxtStudentNum = new javax.swing.JTextField();
        LblStudentLetter = new javax.swing.JLabel();
        TxtStudentLetter = new javax.swing.JTextField();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lblname.setText("Name");

        Txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtnameKeyTyped(evt);
            }
        });

        LblPass.setText("Password");

        LblStudentNum.setText("Student Number");

        TxtStudentNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtStudentNumKeyTyped(evt);
            }
        });

        LblStudentLetter.setText("Student Grade");

        TxtStudentLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtStudentLetterKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtStudentLetterKeyTyped(evt);
            }
        });

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lblname)
                                .addGap(18, 18, 18)
                                .addComponent(Txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblPass)
                                .addGap(18, 18, 18)
                                .addComponent(TxtPass))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblStudentNum)
                                .addGap(18, 18, 18)
                                .addComponent(TxtStudentNum))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblStudentLetter)
                                .addGap(18, 18, 18)
                                .addComponent(TxtStudentLetter))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(CloseButton)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblname)
                    .addComponent(Txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPass)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblStudentNum)
                    .addComponent(TxtStudentNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblStudentLetter)
                    .addComponent(TxtStudentLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(CloseButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtnameKeyTyped
        char charTyped = evt.getKeyChar();
        if (!(Character.isLetter(charTyped) || Character.isSpaceChar(charTyped))) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtnameKeyTyped

    private void TxtStudentNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStudentNumKeyTyped
        char charTyped = evt.getKeyChar();
        if (!(Character.isDigit(charTyped) || Character.isSpaceChar(charTyped))) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtStudentNumKeyTyped

    private void TxtStudentLetterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStudentLetterKeyTyped
        char charTyped = evt.getKeyChar();
        if (!(Character.isLetter(charTyped) || Character.isSpaceChar(charTyped))) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtStudentLetterKeyTyped

    private void TxtStudentLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStudentLetterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtStudentLetterKeyPressed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel LblPass;
    private javax.swing.JLabel LblStudentLetter;
    private javax.swing.JLabel LblStudentNum;
    private javax.swing.JLabel Lblname;
    private javax.swing.JTextField TxtPass;
    private javax.swing.JTextField TxtStudentLetter;
    private javax.swing.JTextField TxtStudentNum;
    private javax.swing.JTextField Txtname;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
