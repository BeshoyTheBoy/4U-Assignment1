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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a Scanner for user input
        Scanner in = new Scanner(System.in);
        //ask user for input
        //Food Expense
        System.out.println("How much was the food expense?");
        double food = in.nextDouble();
        //DJ Expense
        System.out.println("How much was the DJ?");
        double dj = in.nextDouble();
        //Hall expense
        System.out.println("How much was the hall rental?");
        double hall = in.nextDouble();
        //Decorations expense
        System.out.println("How much were the decorations?");
        double decor = in.nextDouble();
        //Wait staff expense
        System.out.println("How much was the wait staff expense?");
        double staff = in.nextDouble();
        //Misc Expense 
        System.out.println("How much were the misc. expenses?");
        double miscexp = in.nextDouble();

        //Add total expense
        double total = food + dj + hall + decor + staff + miscexp;

        //Divide total expenses by $35 to see how many tickets required to break even
        double tickets = Math.ceil(total / 35);



        //Output number of tickets
        System.out.println("Number of tickets needed to break even: " + tickets);
    }
}
