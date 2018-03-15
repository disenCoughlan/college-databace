/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author disen
 */
public class person {
    String fName = "";
    String lName = "";
    
    public void setFName(String enteredFName){
        fName = enteredFName;
    }
    public String getFName(){
        return fName;
    }
     public void setLName(String enteredLName){
        lName = enteredLName;
    }
    public String getLName(){
        return lName;
    }
}
