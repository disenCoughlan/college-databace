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
public class employee {
    private String name = "";
    private String address = "";
    private String payRoleNo = "";
    private String ppsn = "";
    
    public void setName(String enteredName) {
        name = enteredName;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String enteredAddress){
        address = enteredAddress;
    }
    public String getAddress(){
        return address;
    }
    public void setPayRoleNo(String enteredPayRoleNo){
        payRoleNo = enteredPayRoleNo;
    }
    public String getPayRoleNo (){
        return payRoleNo;
    }
    public void setPpsn(String enteredPpsn){
        ppsn = enteredPpsn;
    }
    public String getPpsn(){
        return ppsn;
    }
}
