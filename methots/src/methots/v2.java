/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methots;

/**
 *
 * @author disen
 */
public class v2 extends javax.swing.JFrame {
public double getDouble(String textFieldNubler)
{
    double enteredNumberj = Double.parseDouble(textFieldNubler);
    return enteredNumberj;
}
public double addMethod (double number1,double number2 )
{
    double methodAnc = number1 + number2;
    return methodAnc;
}
public double deviedMethod (double number1,double number2 )
{
    double methodAnc = number1 / number2;
    return methodAnc;
}
 public double subMethod (double number1,double number2 )
{
    double methodAnc = number1 - number2;
    return methodAnc;
}   
    public double multplyMethod (double number1,double number2 )
{
    double methodAnc = number1 * number2;
    return methodAnc;
}       
     /**
     * Creates new form v2
     */
    public v2() {
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
        anwserL = new javax.swing.JLabel();
        addB = new javax.swing.JButton();
        subB = new javax.swing.JButton();
        devideB = new javax.swing.JButton();
        multplyB = new javax.swing.JButton();
        no1Tf = new javax.swing.JTextField();
        no2Tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addB.setText("add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        subB.setText("sub");
        subB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBActionPerformed(evt);
            }
        });

        devideB.setText("devide");
        devideB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideBActionPerformed(evt);
            }
        });

        multplyB.setText("multply");
        multplyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplyBActionPerformed(evt);
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
                            .addComponent(no1Tf)
                            .addComponent(addB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(subB)
                        .addGap(18, 18, 18)
                        .addComponent(devideB)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(no2Tf)
                            .addComponent(multplyB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(anwserL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no1Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addB)
                    .addComponent(subB)
                    .addComponent(devideB)
                    .addComponent(multplyB))
                .addGap(30, 30, 30)
                .addComponent(anwserL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void devideBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devideBActionPerformed
      double no1j = getDouble(no1Tf.getText());
     double no2j = getDouble(no2Tf.getText());
     double devidej = deviedMethod(no1j,no2j);
     anwserL.setText(devidej + "");
    }//GEN-LAST:event_devideBActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
     double no1j = getDouble(no1Tf.getText());
     double no2j = getDouble(no2Tf.getText());
     double addj = addMethod(no1j,no2j);
     anwserL.setText(addj + "");
     
    }//GEN-LAST:event_addBActionPerformed

    private void subBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBActionPerformed
     double no1j = getDouble(no1Tf.getText());
     double no2j = getDouble(no2Tf.getText());
     double subj = subMethod(no1j,no2j);
     anwserL.setText(subj + "");
    }//GEN-LAST:event_subBActionPerformed

    private void multplyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplyBActionPerformed
     double no1j = getDouble(no1Tf.getText());
     double no2j = getDouble(no2Tf.getText());
     double multplyj = multplyMethod(no1j,no2j);
     anwserL.setText(multplyj + "");            
    }//GEN-LAST:event_multplyBActionPerformed

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
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JLabel anwserL;
    private javax.swing.JButton devideB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multplyB;
    private javax.swing.JTextField no1Tf;
    private javax.swing.JTextField no2Tf;
    private javax.swing.JButton subB;
    // End of variables declaration//GEN-END:variables
}