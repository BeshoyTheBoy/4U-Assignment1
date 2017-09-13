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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a scanner for user input
        Scanner in = new Scanner(System.in);
        //Create an initial variable to countdown from
        int initial = 100;
        //Ask user for his number
        System.out.println("Enter a number between 50 and 100 to stop at:");
        //store number in variable
        int number = in.nextInt();
        //if statement for invalid numbers
        if (number < 50 || number > 100) {
            System.out.println("INVALID NUMBER");
        }
        //create for loop to count down until the number is reached
        while (initial > number) {
            initial = initial - 5;
            System.out.println(initial);

        }
    }
}
