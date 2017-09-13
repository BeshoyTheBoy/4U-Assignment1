/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 *
 * @author awadb3223
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year = 1999;
        //in billions
        double pop = 6;
        
        while(pop < 10){
            year = year + 1;
            pop = (pop*.014) + pop;
        }
        System.out.println("The year the population exceeds 10 billion is: " + year);
    }
}
