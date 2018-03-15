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
public class SqlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
prest.setString(1, JOptionPane.showInputDialog("enter book title"));
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
            }
}
catch (SQLException err) {
  System.out.println(err.getMessage());
}

    }
    
}
