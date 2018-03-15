/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
//******************************************************************************
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//******************************************************************************
/**
 *
 * @author disen
 */
public class student extends person {
    //**************************************************************************
    private String studentId = "";
    private String addressLine1 = "";
    private String addressLine2 = "";
    private String county = "";
    private String country = "";
    private String mobile = "";
    private String email = "";
    private String classGroupId = "";
    private String incert = "";
    private String search = "";
    private String personsName = "";
    private String grade = "";
    //**************************************************************************
    public void setStudentId(String enteredStudentId){
        studentId = enteredStudentId;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setAddressLine1(String enteredAddressLine1){
        addressLine1 = enteredAddressLine1;
    }
    public String getAddressLine1(){
        return addressLine1;
    }
    public void setAddressLine2(String enteredAddressLine2){
        addressLine2 = enteredAddressLine2;
    }
    public String getAddressLine2(){
        return addressLine2;
    }
    public void setCounty(String enteredCounty){
        county = enteredCounty;
    }
    public String getCounty(){
        return county;
    }
    public void setCountry(String enteredCountry){
        country = enteredCountry;
    }
    public String getCountry(){
        return country;
    }
    public void setMobile(String enteredMobile){
        mobile = enteredMobile;
    }
    public String getMobile(){
        return mobile;
    }
    public void setEmail(String enteredEmail){
        email = enteredEmail;
    }
    public String getEmail(){
        return email;
    }
    public void setClassGroupId(String enteredClassGroupId){
        classGroupId = enteredClassGroupId;
    }
    public String getClassGroupId(){
        return classGroupId;
    }
    public void incert(){
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
String sql = "insert into students (student_id,first_name,last_name,address_line1,address_line2,county,country,mobile,email,class_group_id)\n" +
"values (?,?,?,?,?,?,?,?,?,?);";
prest = conn.prepareStatement(sql);
prest.setString(1,this.getStudentId());
prest.setString(2,this.getFName());
prest.setString(3,this.getLName());
prest.setString(4,this.getAddressLine1());
prest.setString(5,this.getAddressLine2());
prest.setString(6,this.getCounty());
prest.setString(7,this.getCountry());
prest.setString(8,this.getMobile());
prest.setString(9,this.getEmail());
prest.setString(10,this.getClassGroupId());
System.out.println("runing");
System.out.println(this.getStudentId());
System.out.println(this.getFName());
prest.executeUpdate();
conn.close();
}
catch (SQLException err) {
  System.out.println(err.getMessage());
}
    }
    public static double getDouble(String enteredNumber){
    double number = 0;
    try{
             number = Double.parseDouble(enteredNumber);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "invalid entry");
    }
    return number;
    }
    public void setGrade (double num1,double num2,double num3,double num4){
        double ans = num1 + num2 + num3 + num4;
        if (ans > 100 ){
            JOptionPane.showMessageDialog(null, "invalid entry points too high");
        }
        else if ((ans <= 100)&&(ans >= 80)){
            grade = "Distinction";
        }
        else if ((ans <= 79)&&(ans >= 65)){
            grade = "Merit";
        }
        else if ((ans <= 50)&&(ans >= 64)){
            grade = "Pass";
        }
        else{
            grade = "Unsuccessful";
        }
    }
    public String getGrade(){
        return grade;
    }
//    public void search(String enteredPersonsName){
//        try{
//String url = "jdbc:mysql://127.0.0.1:3306/";
//String dbName = "college";
//          String driver = "com.mysql.jdbc.Driver";
//          String userName = "root";
//          String password = "987456321Dc";
//  //Class.forName(driver).newInstance();
//          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
////Connection con = DriverManager.getConnection(host);
// PreparedStatement prest;
////SQL
//String sql = "SELECT * FROM students WHERE first_name = ?";

// 
//prest = conn.prepareStatement(sql);
//prest.setString(1, personsName = enteredPersonsName);
//       //Results of the sql stored in the resultSet rs1
//        ResultSet rs1 = prest.executeQuery();
////This will loop and show all the results from the sql query
//while (rs1.next()){
//    
//        String firstName = rs1.getString(2);
//        String value = ("First name  : " + firstName );
//        System.out.println( value);
//        
//        String lastName = rs1.getString(3);
//        String value2 = ("Last name :" + lastName);
//        System.out.println( value2);
//        
//        
//       
//            }
//}
//catch (SQLException err) {
//  System.out.println(err.getMessage());
//}
//    }
    //
    //**************************************************************************
}