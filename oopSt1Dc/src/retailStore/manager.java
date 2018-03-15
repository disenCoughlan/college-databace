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
public class manager extends staff {

    private int yearsOfServies = 0;
    private double salery = 0;
    
    public void setYearsOfServies(String enteredYearsOfServies) {
        yearsOfServies = Integer.parseInt(enteredYearsOfServies);
    }
    public int getYearsOfServies() {
        return yearsOfServies;
    }
    public void setCalculateSalery() {
        salery = yearsOfServies * 20000;
    }
    public double getCalculateSalery() {
        return salery;
    }
}
