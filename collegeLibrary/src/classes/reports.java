/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author disen
 */
public class reports {
    public void report1(){
        try{
            String url = "jdbc:mysql://127.0.0.1:3306/";
            String dbName = "college";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "987456321Dc";
            //Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            //Connection con = DriverManager.getConnection(host);
            PreparedStatement prest;
            //SQL
            String sql = "select distinct students.first_name,students.last_name from students,students_results where grade = ?;";

            prest = conn.prepareStatement(sql);
            //Results of the sql stored in the resultSet rs1
            prest.setString(1, "Distinction");
            ResultSet rs1 = prest.executeQuery();
            //This will loop and show all the results from the sql query
            while (rs1.next()){
//                JOptionPane.showMessageDialog(null,rs1.getObject(1));
                
                String first_name = rs1.getString(1);
                String value1 = ("Student Name  : " + first_name );
                System.out.println( value1);
                String lastName = rs1.getString(2);
                String value2 = ("Last name :" + lastName);
                System.out.println( value2);
            }
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    public void report2(){
        try{
            String url = "jdbc:mysql://127.0.0.1:3306/";
            String dbName = "college";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "987456321Dc";
            //Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            //Connection con = DriverManager.getConnection(host);
            PreparedStatement prest;
            //SQL
            String sql = "select count(student_id)from students;";

            prest = conn.prepareStatement(sql);
            //Results of the sql stored in the resultSet rs1
            ResultSet rs1 = prest.executeQuery();
            //This will loop and show all the results from the sql query
            while (rs1.next()){
//                JOptionPane.showMessageDialog(null,rs1.getObject(1));
                
                String first_name = rs1.getString(1);
                String value1 = ("Student Numbers  : " + first_name );
                System.out.println( value1);
                JOptionPane.showMessageDialog(null,rs1.getObject(1)+" students");
            }
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    public void report3(){
        try{
            String url = "jdbc:mysql://127.0.0.1:3306/";
            String dbName = "college";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "987456321Dc";
            //Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            //Connection con = DriverManager.getConnection(host);
            PreparedStatement prest;
            //SQL
            String sql = "";

            prest = conn.prepareStatement(sql);
            //Results of the sql stored in the resultSet rs1
            ResultSet rs1 = prest.executeQuery();
            //This will loop and show all the results from the sql query
            while (rs1.next()){
//                JOptionPane.showMessageDialog(null,rs1.getObject(1));
                
                String first_name = rs1.getString(1);
                String value1 = ("Student Numbers  : " + first_name );
                System.out.println( value1);
                
            }
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
