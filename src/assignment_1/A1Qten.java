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
public class A1Qten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner in = new Scanner(System.in);
        //boolean variable to run while loop
        boolean start = true;
        //string variable
        String words = new String();
        //counter variable
        int counter = 0;

        System.out.println("Please enter in as many words as you'd like, type 'exit' to count words.");
        //while loop that adds 1 to counter everytime a word is entered
        while (start = true) {
            words = in.nextLine();
            counter = counter + 1;
            
            //if the word is exit or Exit
            if (words.equals("exit") || words.equals("Exit")) {
                //subtract the word 'exit' from counter
                counter = counter - 1;
                //sout the answer
                System.out.println("The number of words: " + counter);
                //break loop
                break;
            }
        }
    }
}
