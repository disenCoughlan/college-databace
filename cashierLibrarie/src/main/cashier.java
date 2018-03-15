/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import retailStore.staff;
/**
 *
 * @author disen
 */
public class cashier extends staff {
    private double sRate = 0;
    private double sHours = 0;
    private double oRate = 0;
    private double oHours = 0;
    private double wage = 0;
    
    public cashier(double sRateP, double oRateP){
        if(sRate == 0||oRate == 0){
            sRate = 9.50;
            oRate = 12.50;
        }
        else{
            sRate = sRateP;
            oRate = oRateP;   
    }
        
    }
    public cashier(){
        
    }
    
    public void setSRate (String enteredSRate){
       sRate = Double.parseDouble(enteredSRate);
    }
    public double getSRate (){
        return sRate;
    }
    public void setSHours (String enteredSHours){
        sHours = Double.parseDouble(enteredSHours);
    }
    public double getSHours (){
        return sHours;
    }
     public void setORate (String enteredORate){
       oRate = Double.parseDouble(enteredORate);
    }
    public double getORate (){
        return oRate;
    }
    public void setOHours (String enteredOHours){
        oHours = Double.parseDouble(enteredOHours);
    }
    public double getOHours (){
        return oHours;
    }
    public void setCalculateWages (){
        wage = (sRate*sHours)+(oRate*oHours);
    }
    public double getCalculatedWage(){
         return wage;
    }
}
