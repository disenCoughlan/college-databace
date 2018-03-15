/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methots1;

import javax.swing.JOptionPane;

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
    public static double getSquarAns(double num1,double num2){
        double ans = num1 * num2;
        return ans;
    }
    public static double getCircleAns(double num1){
        double ans = (num1*num1) * 3.14;
        return ans;
    }
    public static double getTrangleAns(double num1, double num2){
        double ans = (num1/2)*num2;
        return ans;
    }
}
