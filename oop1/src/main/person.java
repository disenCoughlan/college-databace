/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author disen
 */
public class person {

    private String name = "";
    private String address = "";
    private String dob = "";

    public void setName(String enteredname) {
        name = enteredname;
    }

    public String getName() {
        return name;
    }
    public void setAddress(String enteredaddress){
        address = enteredaddress;
    }
    public String getAddress(){
        return address;
    }
    public void setDob(String entereddob){
        dob = entereddob;
    }
    public String getDob(){
        return dob;
    }
}
