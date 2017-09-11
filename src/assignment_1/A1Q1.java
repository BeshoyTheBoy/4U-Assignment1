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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner for user input
        Scanner in = new Scanner(System.in);
        //ask user for name
        System.out.println("Please enter your name");
        //create a string for user to enter name
        String name = in.nextLine();
        //Reply
        System.out.println("Hello, " + name + "!");
    }
}
