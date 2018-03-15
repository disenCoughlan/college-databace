/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_databace_disen_coughlan;

/**
 *
 * @author disen
 */
public class teacherFrame extends javax.swing.JFrame {

    /**
     * Creates new form teacherFrame
     */
    public teacherFrame() {
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
        addResultB = new javax.swing.JButton();
        studentRecordB = new javax.swing.JButton();
        signOutB = new javax.swing.JButton();
        editStudentResultB = new javax.swing.JButton();
        studentReportsB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(80, 200, 120));

        addResultB.setText("add student/class group result");
        addResultB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResultBActionPerformed(evt);
            }
        });

        studentRecordB.setText("show student record");
        studentRecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRecordBActionPerformed(evt);
            }
        });

        signOutB.setText("sign out");
        signOutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBActionPerformed(evt);
            }
        });

        editStudentResultB.setText("edit student result");
        editStudentResultB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentResultBActionPerformed(evt);
            }
        });

        studentReportsB.setText("show student reports");
        studentReportsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentReportsBActionPerformed(evt);
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
                        .addComponent(signOutB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentRecordB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addResultB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editStudentResultB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentReportsB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(addResultB)
                .addGap(18, 18, 18)
                .addComponent(editStudentResultB)
                .addGap(18, 18, 18)
                .addComponent(studentRecordB)
                .addGap(18, 18, 18)
                .addComponent(studentReportsB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(signOutB)
                .addContainerGap())
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

    private void signOutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBActionPerformed
        loginFrame loginFrame = new loginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signOutBActionPerformed

    private void addResultBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResultBActionPerformed
        addStudentResultsFrame addStudentResultsFrame = new addStudentResultsFrame();
        addStudentResultsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addResultBActionPerformed

    private void studentRecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRecordBActionPerformed
        showStudentRecordFrame showStudentRecordFrame = new showStudentRecordFrame();
        showStudentRecordFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentRecordBActionPerformed

    private void editStudentResultBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentResultBActionPerformed
        editStudentResultFrame editStudentResultFrame = new editStudentResultFrame();
        editStudentResultFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editStudentResultBActionPerformed

    private void studentReportsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentReportsBActionPerformed
        studentsReportsFrame studentsReportsFrame = new studentsReportsFrame();
        studentsReportsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentReportsBActionPerformed

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
            java.util.logging.Logger.getLogger(teacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addResultB;
    private javax.swing.JButton editStudentResultB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signOutB;
    private javax.swing.JButton studentRecordB;
    private javax.swing.JButton studentReportsB;
    // End of variables declaration//GEN-END:variables
}