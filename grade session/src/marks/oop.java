/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

/**
 *
 * @author disen
 */
public class oop extends javax.swing.JFrame {
public static int ancerOj=0;
    /**
     * Creates new form oop
     */
    public oop() {
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
        assment1L = new javax.swing.JLabel();
        assment1Tf = new javax.swing.JTextField();
        assment2L = new javax.swing.JLabel();
        assment2Tf = new javax.swing.JTextField();
        examL = new javax.swing.JLabel();
        examTf = new javax.swing.JTextField();
        okB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();
        overallB = new javax.swing.JButton();
        backToMenuB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OOP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        assment1L.setText("assment1 of 30");

        assment1Tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                assment1TfKeyTyped(evt);
            }
        });

        assment2L.setText("assment2 of 30");

        assment2Tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                assment2TfKeyTyped(evt);
            }
        });

        examL.setText("exam of 40");

        examTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                examTfKeyTyped(evt);
            }
        });

        okB.setText("Ok");
        okB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBActionPerformed(evt);
            }
        });

        closeB.setText("Close");
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        overallB.setText("Overall");
        overallB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallBActionPerformed(evt);
            }
        });

        backToMenuB.setText("Back to Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(assment1L)
                            .addGap(18, 18, 18)
                            .addComponent(assment1Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(assment2L)
                                .addComponent(examL))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(assment2Tf)
                                .addComponent(examTf))))
                    .addComponent(okB)
                    .addComponent(closeB)
                    .addComponent(overallB)
                    .addComponent(backToMenuB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assment1L)
                    .addComponent(assment1Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assment2L)
                    .addComponent(assment2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examL)
                    .addComponent(examTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overallB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backToMenuB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBActionPerformed
maths mathsFrame = new maths ();
       mathsFrame.setVisible(true);
       int assment1j = Integer.parseInt(assment1Tf.getText());
       int assment2j = Integer.parseInt(assment2Tf.getText());
       int examj = Integer.parseInt(examTf.getText());
       ancerOj = assment1j + assment2j + examj;
       this.dispose();
    }//GEN-LAST:event_okBActionPerformed

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
       this.dispose();
    }//GEN-LAST:event_closeBActionPerformed

    private void overallBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallBActionPerformed
       overAllResult overAllResultFrame = new overAllResult ();
       overAllResultFrame.setVisible(true);
       int assment1j = Integer.parseInt(assment1Tf.getText());
       int assment2j = Integer.parseInt(assment2Tf.getText());
       int examj = Integer.parseInt(examTf.getText());
       ancerOj = assment1j + assment2j + examj;
       this.dispose();
    }//GEN-LAST:event_overallBActionPerformed

    private void assment1TfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assment1TfKeyTyped
   if(assment1Tf.getText().length()>=2)
{
    evt.consume();
}
   char charTyped = evt.getKeyChar();

              if (!(Character.isDigit(charTyped)||Character.isISOControl(charTyped))){
            
                 evt.consume();
              }
    }//GEN-LAST:event_assment1TfKeyTyped

    private void assment2TfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assment2TfKeyTyped
if(assment2Tf.getText().length()>=2)
{
    evt.consume();
}
char charTyped = evt.getKeyChar();

              if (!(Character.isDigit(charTyped)||Character.isISOControl(charTyped))){
            
                 evt.consume();
              }
    }//GEN-LAST:event_assment2TfKeyTyped

    private void examTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_examTfKeyTyped
if(examTf.getText().length()>=2)
{
    evt.consume();
}
char charTyped = evt.getKeyChar();

              if (!(Character.isDigit(charTyped)||Character.isISOControl(charTyped))){
            
                 evt.consume();
              }
    }//GEN-LAST:event_examTfKeyTyped

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
            java.util.logging.Logger.getLogger(oop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assment1L;
    private javax.swing.JTextField assment1Tf;
    private javax.swing.JLabel assment2L;
    private javax.swing.JTextField assment2Tf;
    private javax.swing.JButton backToMenuB;
    private javax.swing.JButton closeB;
    private javax.swing.JLabel examL;
    private javax.swing.JTextField examTf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okB;
    private javax.swing.JButton overallB;
    // End of variables declaration//GEN-END:variables
}
