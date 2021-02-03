/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;

/**
 *
 * @author jonch
 */
public class OSUSOEZ {
    public static void main(String[] args)
    {
        int[] list = new int[]{1,2,4,5,10,100,2,-22};
        
        System.out.println("This method will print out the index of the smallest integer in the list array.");
        int smallest = smallestIndex(list);
        System.out.println("The index of the smallest number is " + smallest);
    }    
    
    public static int smallestIndex(int[] list){
        int smallest = list[0], index = 0;
        for(int x = 1; x < list.length ; x++)
        {
            if(list[x] < smallest || list[x] == smallest)
            {
                smallest = list[x];
                index = x;
            }
        }
        
        return index;
    }
}
