/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltest;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author disen
 */
public class v2 extends javax.swing.JFrame {

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
        jLabel1 = new javax.swing.JLabel();
        bookNameTf = new javax.swing.JTextField();
        runB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("enter the book name");

        runB.setText("run");
        runB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(runB)
                        .addGap(0, 227, Short.MAX_VALUE))
                    .addComponent(bookNameTf))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(runB)
                .addContainerGap(199, Short.MAX_VALUE))
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

    private void runBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBActionPerformed
       try{
String url = "jdbc:mysql://127.0.0.1:3306/";
String dbName = "disencoughlanbookstore2";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root";
          String password = "987456321Dc";
  //Class.forName(driver).newInstance();
          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
//Connection con = DriverManager.getConnection(host);
 PreparedStatement prest;
//SQL
String sql = "SELECT * FROM BOOK WHERE TITLE = ?";
//String sql = "SELECT * FROM BOOK";
 
prest = conn.prepareStatement(sql);
prest.setString(1, bookNameTf.getText().toString());
       //Results of the sql stored in the resultSet rs1
        ResultSet rs1 = prest.executeQuery();
//This will loop and show all the results from the sql query
while (rs1.next()){
    
        String ISBN = rs1.getString(1);
        String value = ("ISBN  : " + ISBN );
        System.out.println( value);
       
        String TITLE = rs1.getString(2);
        String value1 = ("TITLE   : " + TITLE );
        System.out.println( value1);
       
        String AUTHOR = rs1.getString(3);
        String value2 = ("AUTHOR  : " + AUTHOR );
        System.out.println( value2);
       
        String YEAR = rs1.getString(4);
        String value3 = ("YEAR  : " + YEAR );
        System.out.println( value3);
       
        String BINDING = rs1.getString(5);
        String value4 = ("BINDING  : " + BINDING );
        System.out.println( value4);
       
        String RRP = rs1.getString(6);
        String value5 = ("RRP  : " + RRP );
        System.out.println( value5);
       
        String QTY_ON_HAND = rs1.getString(7);
        String value6 = ("QTY_ON_HAND  : " + QTY_ON_HAND );
        System.out.println( value6);
       
        String MIN_STOCK_LEVEL = rs1.getString(8);
        String value7 = ("MIN_STOCK_LEVEL  : " + MIN_STOCK_LEVEL );
        System.out.println( value7);
       
        String PUBL_CODE = rs1.getString(9);
        String value8 = ("PUBL_CODE  : " + PUBL_CODE );
        System.out.println( value8);
       
        String CATEGORY = rs1.getString(10);
        String value9 = ("CATEGORY  : " + CATEGORY+"\n" );
        System.out.println( value9);
        JOptionPane.showMessageDialog(null,value+"\n"+value1+"\n"+value2+"\n"+value3+"\n"+value4+"\n"+value5+"\n"+value6+"\n"+value7+"\n"+value8+"\n"+value9);
            }
}
catch (SQLException err) {
  System.out.println(err.getMessage());
}
    }//GEN-LAST:event_runBActionPerformed

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
    private javax.swing.JTextField bookNameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton runB;
    // End of variables declaration//GEN-END:variables
}
