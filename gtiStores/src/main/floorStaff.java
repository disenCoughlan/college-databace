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
public class floorStaff extends employee {
    private double rate = 0;
    private double hours = 0;
    private double wage = 0;
    
    public void setRate (String enteredRate){
       rate = Double.parseDouble(enteredRate);
    }
    public double getRate (){
        return rate;
    }
    public void setHours (String enteredHours){
        hours = Double.parseDouble(enteredHours);
    }
    public double getHours (){
        return hours;
    }
    public void setCalculateWages (){
        wage = (rate*hours);
    }
    public double getCalculatedWage(){
         return wage;
    }
}
