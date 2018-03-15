/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtiapp;

/**
 *
 * @author disen
 */
public class Aplacent {
    private String name = "";
    private String address = "";
    private int phoneNumber = 0;
    private String course = "";
    
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
    public void setPhoneNumber (String enteredPhoneNumber){
        phoneNumber = Integer.parseInt(enteredPhoneNumber);
    }
    public int getPhoneNumber (){
        return phoneNumber;
    }
    public void setCourse (String enteredCourse){
        course = enteredCourse;
    }
    public String getCourse (){
        return course;
    }
    
}
