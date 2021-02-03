/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;
import java.util.Scanner;
/**
 *
 * Author : Jon Chew Chun Wai
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aboEquAvg = 0, belowAvg = 0;
        double sum = 0; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of quiz scores to process : ");
        int numberInt = input.nextInt();
        double[] ansInput = new double[numberInt];
        for(int x = 0; x < numberInt ; x++)
        {
            System.out.print("Score " + (x+1) + " : ");
            ansInput[x] = input.nextDouble();
            sum += ansInput[x];
        }
        
        System.out.println("Results");
        System.out.println("==========");
        double average = sum / numberInt;
        System.out.printf("Average is %.2f. \n", average);
        
        for(int x = 0; x < numberInt; x++)
        {
            if(ansInput[x] > average || ansInput[x] == 0)         
                aboEquAvg++;
            else
                belowAvg++;
        }
        
        System.out.printf("Number of scores above or equal to the average is %d. \n", aboEquAvg);
        System.out.printf("Number of scores below the avrage is %d. ", belowAvg);
    }
    
}
