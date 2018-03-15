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
public class salesperson extends staff {
    private double itemsSolded = 0;
    private double totalCost = 0;
    private double commission = 0;
    public void setItemsSolded (String enteredItemsSolded){
       itemsSolded = Double.parseDouble(enteredItemsSolded);
    }
    public double getItemsSolded (){
        return itemsSolded;
    }
    public void setTotalCost (String enteredTotalCost){
       totalCost = Double.parseDouble(enteredTotalCost);
    }
    public double getTotalCost (){
        return totalCost;
    }
    public void setCommission (){
        commission = (totalCost * 0.05)*itemsSolded;
    }
    public double getCommission (){
        return commission;
    }
}
