/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch02pc07;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * @date    10/18/2017
 * @Purpose: To calculate sales tax
 */
public class Ch02PC07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchase, countyTax, stateTax, totalTax, cost;       //amount of purchase
        final double stateTaxRate = 0.04, countyTaxRate = 0.02;     //Sales tax amounts
        Scanner keyboard = new Scanner(System.in);
                
        //User enters amount of purchase
        System.out.print("What was the purchase price? ");
        purchase = keyboard.nextDouble();
        
        //Calculations
        countyTax = purchase * countyTaxRate;
        stateTax = purchase * stateTaxRate;
        totalTax = countyTax + stateTax;
        cost = purchase + totalTax;
        
        //Display information to the user
        System.out.println("Purchase Amount: " + purchase + "\n" 
                + "State Sales Tax: " + stateTax + "\n"
                + "County Sales Tax: " + countyTax + "\n"
                + "Total Cost: " + cost
        );
        
    }
    
}
