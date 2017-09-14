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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a scanner for user input
        Scanner in = new Scanner(System.in);
        //Create Array to store 3 numbers in
        double[] numbers = new double[3];
        //Ask user for 3 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = in.nextDouble();
        }

        //Multiply all three numbers to find product
        double product = numbers[0] * numbers[1] * numbers[2];
        //Square the product
        double productsquared = Math.pow(product, 2);
        //Square root the product
        double rootproduct = Math.sqrt(product);

        //Output answers to users
        System.out.println("The product is " + product);
        System.out.println("The product squared is " + productsquared);
        System.out.println("The square root of the product is " + rootproduct);

    }
}
