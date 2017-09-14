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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner in = new Scanner(System.in);
        //create an array to store 10 words
        String[] words = new String[10];
        //create a variable to store the word lengths in
        double lengths = 0;
        
        //for loop to fill in array
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter in Word");
            words[i] = in.nextLine();
            //find the length of word just entered   
            //store length of word inside lengths variable
            lengths = lengths + words[i].length();
        }
        
        //find average word length
        double average = lengths/10;
        System.out.println("The average word length is: " + average);
    }
}
