/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_databace_disen_coughlan;
import classes.staff;
import javax.swing.JOptionPane;

/**
 *
 * @author disen
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    public loginFrame() {
        initComponents();
    }
//    staff s1 = new staff("admin1","Ailill","Ó hEaghra","L'_<3a.&b*PmN-/M");
//    staff s2 = new staff("admin2","Calbhach","Ó Cearmada","Z/(?s6v$C3fB8:F>");
//    staff s3 = new staff("tec001","Damhnait","MacGuinness","ZJkeUpntaN'Q8]4q");
//    staff s4 = new staff("tec002","Ciannait","Duffy","Xjc]('<F84=Kn~Q£");
//    staff s5 = new staff("tec003","Kennedy","Dermott","A.3]DMVcu8f%BT)#");
//    staff s6 = new staff("tec004","Eadan","Cullen","Z:Gh43c-HW~MLn/F");
//    staff s7 = new staff("tec005","Tuathal","McCabe","j'Jp#UK62$LsCQ/!");
//    staff s8 = new staff("tec006","Léan","McGuinness","Va.mf&cUPM3Sy!Cg");
//    staff s9 = new staff("tec007","Nainsí","McFarlane","M6CJQX=.+7x,^)ka");
//    staff s10 = new staff("tec008","Tiarnach","Malloye","z)#35EfVuw=;b^+$");
//    staff s11 = new staff("tec009","Gobnet","Guinness","y)-6%n,~'>Dh.q2C");
//    staff s12 = new staff("tec010","Gilroy","O'Gorman","EbM#u4yV:.25Gk7P");
    staff s1 = new staff();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameL = new javax.swing.JLabel();
        passwordPf = new javax.swing.JPasswordField();
        userNameTf = new javax.swing.JTextField();
        passwordL = new javax.swing.JLabel();
        loginB = new javax.swing.JButton();
        quitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userNameL.setText("user name");

        passwordPf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordPfKeyPressed(evt);
            }
        });

        passwordL.setText("password");

        loginB.setText("login");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });

        quitB.setText("quit");
        quitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameL)
                    .addComponent(passwordL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordPf)
                    .addComponent(userNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginB)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addComponent(quitB)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameL)
                    .addComponent(userNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordL))
                .addGap(39, 39, 39)
                .addComponent(loginB)
                .addGap(67, 67, 67)
                .addComponent(quitB))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
//        s1.setStaffId(userNameTf.getText());
//        s1.setLogin(passwordPf.getText());


//        s1.setLoginCheck(userNameTf.getText(),passwordPf.getText());
//        s1.setLoginCheckA(userNameTf.getText(),passwordPf.getText());
//        if(s1.getLoginCheck().equals(true)){
//        teacherFrame teacherFrame = new teacherFrame();
//        teacherFrame.setVisible(true);
//        this.dispose();
//        }
//        else if(s1.getLoginCheckA().equals(true)){
//        adminFrame adminFrame = new adminFrame();
//        adminFrame.setVisible(true);
//        this.dispose();

        if(userNameTf.getText().equals("tec001") && passwordPf.getText().equals("ZJkeUpntaN'Q8]4q")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec002") && passwordPf.getText().equals("Xjc]('<F84=Kn~Q£")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec003") && passwordPf.getText().equals("A.3]DMVcu8f%BT)#")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec004") && passwordPf.getText().equals("Z:Gh43c-HW~MLn/F")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec005") && passwordPf.getText().equals("j'Jp#UK62$LsCQ/!")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec006") && passwordPf.getText().equals("Va.mf&cUPM3Sy!Cg")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec007") && passwordPf.getText().equals("M6CJQX=.+7x,^)ka")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec008") && passwordPf.getText().equals("z)#35EfVuw=;b^+$")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec009") && passwordPf.getText().equals("y)-6%n,~'>Dh.q2C")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec010") && passwordPf.getText().equals("EbM#u4yV:.25Gk7P")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("admin1") && passwordPf.getText().equals("L'_<3a.&b*PmN-/M")){
        adminFrame adminFrame = new adminFrame();
        adminFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("admin2") && passwordPf.getText().equals("Z/(?s6v$C3fB8:F>")){
        adminFrame adminFrame = new adminFrame();
        adminFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("admin3") && passwordPf.getText().equals("admin3")){
        adminFrame adminFrame = new adminFrame();
        adminFrame.setVisible(true);
        this.dispose();
        }
        else if(userNameTf.getText().equals("tec011") && passwordPf.getText().equals("tec011")){
        teacherFrame teacherFrame = new teacherFrame();
        teacherFrame.setVisible(true);
        this.dispose();
        }
        else{
             JOptionPane.showMessageDialog(null,"wrong id or password");
        }
    }//GEN-LAST:event_loginBActionPerformed

    private void quitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitBActionPerformed

    private void passwordPfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordPfKeyPressed
        //implement in a enter key to press login
        int keycode = evt.getKeyCode();
if(keycode == evt.VK_ENTER){
        //how to do this?
        //
}
    }//GEN-LAST:event_passwordPfKeyPressed

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginB;
    private javax.swing.JLabel passwordL;
    private javax.swing.JPasswordField passwordPf;
    private javax.swing.JButton quitB;
    private javax.swing.JLabel userNameL;
    private javax.swing.JTextField userNameTf;
    // End of variables declaration//GEN-END:variables
}
