
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author disen
 */
public class methots {
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
    public static double getKg(double lbs){
    double kg = lbs/0.45359237 ;
    return kg ;
    }
    public static double getLbs(double kg){
    double lbs = kg*0.45359237;
    return lbs;
    }
}