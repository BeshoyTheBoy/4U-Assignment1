/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.util.Scanner;

/**
 *
 * @author awadb3223
 */
public class A1Q8 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a scanner
        Scanner in = new Scanner(System.in);
        //Ask user for values
        System.out.println("Interest Rate in decimal form:");
        double r = in.nextDouble();
        System.out.println("Initial Balance:");
        double balance = in.nextDouble();
        //initial year
        int year = 0;
        //initial years for million
        int milYear = 0;
        //the double of initial amount
        double mult = balance * 2;
        
        //Find out after how long the money will double
        while (balance < mult) {
            balance = (1+r)*balance;
            year = year + 1;
        }
        System.out.println("The money will double in " + year + " years.");
        
        //Find out when money will reach 1 million dollars
        while (balance <= 10*10*10*10*10*10){
        balance = (1+r)*balance;
        milYear = milYear + 1;
    }
        System.out.println("");
        System.out.println("You will reach 1 million after " + milYear + " years.");
  }
}
