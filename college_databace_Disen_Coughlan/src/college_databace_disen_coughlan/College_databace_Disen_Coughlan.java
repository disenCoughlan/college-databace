/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_databace_disen_coughlan;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author disen
 */
public class College_databace_Disen_Coughlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
String url = "jdbc:mysql://127.0.0.1:3306/";
String dbName = "college";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root";
          String password = "987456321Dc";
  //Class.forName(driver).newInstance();
          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
//Connection con = DriverManager.getConnection(host);

}
catch (SQLException err) {
  System.out.println(err.getMessage());
}
         loginFrame loginFrame = new loginFrame();
         loginFrame.setVisible(true);
    }
    
}
