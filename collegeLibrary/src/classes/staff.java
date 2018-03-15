/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;


/**
 *
 * @author disen
 */
public class staff extends person {
    private String staffId = "";
    private String login = "";
    private String loginCheck = "";
    private String loginCheckA = "";
    public staff(String staffIdP,String fNameP,String lNameP,String loginP){
        staffId = staffIdP;
        fName = fNameP;
        lName = lNameP;
        login = loginP;
    }
    public staff (){
    
    }
    public void setStaffId(String enteredStaffId){
        staffId = enteredStaffId;
    }
    public String getStaffId(){
        return staffId;
    }
    
     public void setLogin(String enteredLogin){
        login = enteredLogin;
    }
    public String getLogin(){
        return login;
    }
    public String getLoginCheck(){
        return loginCheck;
    }
   
}
