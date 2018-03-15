/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author disen
 */
public class methods {
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
    public static double CalculateIncrease(double num1, double num2) {
        if (num1 <= 50000) {
            double ans = num1 + ((num2 / 100) * num1);
            return ans;
        } else {
            double ans = num1;
            return ans;
        }
    }
}
