/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;
import java.util.Scanner;
/**
 *
 * @author jonch
 */
public class Banking {
    public static void main(String[] args)
    {
        int[] Denomination = new int[]{100,50,20,10,5,1};
        int[] Quantity = new int[Denomination.length];
        int sum = 0;
        Scanner userInput = new Scanner(System.in);

        
        System.out.println("\n\nDenomination \t\t     Quantity");
        
        for(int x = 0; x < Denomination.length; x++)
        {
            System.out.print(Denomination[x] + "\t\t\t\t");
             Quantity[x] = userInput.nextInt();
        } 
        
        System.out.println("\n\nDenomination \t\t     Quantity  \t\t Value (RM) ");
        
        for(int x = 0; x < Denomination.length; x++)
        {
            if(Quantity[x] != 0)
            {
                System.out.println(Denomination[x] + "\t\t\t\t" + Quantity[x] + "\t\t\t" + (Denomination[x] * Quantity[x]));
                sum += (Denomination[x]*Quantity[x]);
            }
        }
        
        System.out.println("Total = RM" + sum);
    }
}
