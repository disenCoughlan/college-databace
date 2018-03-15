/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailStore;

/**
 *
 * @author disen
 */
public class staff {
    private String fName = "";
    private String lName = "";
    private String address = "";
    private String payRoleNo = "";
    private String ppsn = "";
    
    public void setFName(String enteredFName) {
        fName = enteredFName;
    }
    public String getFName() {
        return fName;
    }
    public void setLName(String enteredLName) {
        lName = enteredLName;
    }
    public String getLName() {
        return lName;
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
