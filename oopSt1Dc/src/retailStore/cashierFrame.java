/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailStore;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.cashier;

/**
 *
 * @author disen
 */
public class cashierFrame extends javax.swing.JFrame {
//double a = Double.parseDouble(rateSPayTf.getText());
//double b = Double.parseDouble(rateOpayTf.getText());
    /**
     * Creates new form cashierFrame
     */
    public cashierFrame() {
        initComponents();
    }
        cashier c1 = new cashier(9.55,12.55);
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fNameTf = new javax.swing.JTextField();
        lNameTf = new javax.swing.JTextField();
        addressTf = new javax.swing.JTextField();
        payRoleNumberTf = new javax.swing.JTextField();
        ppsnTf = new javax.swing.JTextField();
        hoursSTTf = new javax.swing.JTextField();
        rateSPayTf = new javax.swing.JTextField();
        hoursOTTf = new javax.swing.JTextField();
        rateOpayTf = new javax.swing.JTextField();
        saveB = new javax.swing.JButton();
        viewB = new javax.swing.JButton();
        quitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("address");

        jLabel4.setText("Pay role number");

        jLabel5.setText("ppsn");

        jLabel6.setText("hours of standerd time");

        jLabel7.setText("rate of standerd pay");

        jLabel8.setText("hours of overtime");

        jLabel9.setText("rate of overtime pay");

        rateOpayTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rateOpayTfMouseClicked(evt);
            }
        });

        saveB.setText("save");
        saveB.setVisible(false);
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        viewB.setText("view");
        viewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBActionPerformed(evt);
            }
        });

        quitB.setText("back to main menu");
        quitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fNameTf)
                            .addComponent(lNameTf)
                            .addComponent(addressTf)
                            .addComponent(payRoleNumberTf)
                            .addComponent(ppsnTf)
                            .addComponent(hoursSTTf)
                            .addComponent(rateSPayTf)
                            .addComponent(hoursOTTf)
                            .addComponent(rateOpayTf, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quitB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveB, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(payRoleNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ppsnTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hoursSTTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rateSPayTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hoursOTTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rateOpayTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(viewB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitB)
                        .addContainerGap())))
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

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        c1.setFName(fNameTf.getText());
        c1.setLName(lNameTf.getText());
        c1.setAddress(addressTf.getText());
        c1.setPayRoleNo(payRoleNumberTf.getText());
        c1.setPpsn(ppsnTf.getText());
        c1.setSHours(hoursSTTf.getText());
        c1.setSRate(rateSPayTf.getText());
        c1.setOHours(hoursOTTf.getText());
        c1.setORate(rateOpayTf.getText());
        c1.setCalculateWages();
        try {
            FileWriter outFile = new FileWriter("‪C:\\Users\\disen\\Desktop\\gti stors Disen Coughaln\\records\\"+c1.getFName()+".txt");
            PrintWriter out = new PrintWriter(outFile);
            out.println(""+c1.getFName());
            out.println(""+c1.getLName());
            out.println(""+c1.getAddress());
            out.println(""+c1.getPayRoleNo());
            out.println(""+c1.getPpsn());
            out.println(""+c1.getSHours());
            out.println(""+c1.getSRate());
            out.println(""+c1.getOHours());
            out.println(""+c1.getORate());
            out.println(""+c1.getCalculatedWage());
            out.close();
        } catch (IOException e) {
            Logger.getLogger(managerFrame.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        fNameTf.setText("");
        lNameTf.setText("");
        addressTf.setText("");
        payRoleNumberTf.setText("");
        ppsnTf.setText("");
        hoursSTTf.setText("");
        rateSPayTf.setText("");
        hoursOTTf.setText("");
        rateOpayTf.setText("");
    }//GEN-LAST:event_saveBActionPerformed

    private void quitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBActionPerformed
        calculatePayrole calculatePayroleFrame = new calculatePayrole();
        calculatePayroleFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quitBActionPerformed

    private void viewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBActionPerformed
        JOptionPane.showMessageDialog(null,c1.getFName()+"\n"+c1.getLName()+"\n"+c1.getAddress()+"\n"+c1.getPayRoleNo()+"\n"+c1.getPpsn()+"\n"+c1.getCalculatedWage());
    }//GEN-LAST:event_viewBActionPerformed

    private void rateOpayTfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rateOpayTfMouseClicked
        saveB.setVisible(true);
    }//GEN-LAST:event_rateOpayTfMouseClicked

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
            java.util.logging.Logger.getLogger(cashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashierFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTf;
    private javax.swing.JTextField fNameTf;
    private javax.swing.JTextField hoursOTTf;
    private javax.swing.JTextField hoursSTTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNameTf;
    private javax.swing.JTextField payRoleNumberTf;
    private javax.swing.JTextField ppsnTf;
    private javax.swing.JButton quitB;
    private javax.swing.JTextField rateOpayTf;
    private javax.swing.JTextField rateSPayTf;
    private javax.swing.JButton saveB;
    private javax.swing.JButton viewB;
    // End of variables declaration//GEN-END:variables
}