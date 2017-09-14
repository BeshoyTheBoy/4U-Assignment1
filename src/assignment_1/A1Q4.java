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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a scanner
        Scanner in = new Scanner(System.in);
        //ask user for number between 1 and 10
        System.out.println("Please enter a number between 1 and 10");
        //create variable to store the number
        int number = in.nextInt();
        //If statement to identfy the number of asterisks
        //if the number is greater than 10 or less than one
        if (number > 10 || number < 1) {
            System.out.println("INVALID NUMBER");
            //else if the number is between 1 and 10
        } else if (number >= 1 && number <= 10) {
            //for loop that counts up to the number, while printing an asterisk everytime it goes up 1
            for (int i = 0; i < number; i++) {
                System.out.print("*");

            }
        }
    }
}
