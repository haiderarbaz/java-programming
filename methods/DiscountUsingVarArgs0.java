import java.lang.*;
import java.util.*;

//read from keyboard
public class DiscountUsingVarArgs0
{	
	static double discount(double...P)
	{
		double s=0;
		
		// Summing up the prices
		for(int i=0;i<P.length;i++)
		{
			s=s+P[i];
		}
		
		// Applying discount based on total sum
		if(s<500) return s*0.10;
        else if(s>=500 && s<1000) return s*0.15;
        else return s*0.20;
	}
	public static void main(String[] args)
	{
		// Create a Scanner object to read input from the user
        Scanner scn = new Scanner(System.in);
        
        // Ask user how many prices they want to enter
        System.out.print("How many prices do you want to enter? ");
        int n = scn.nextInt();
        
        // Create an array to store the prices
        double[] prices = new double[n];
        
        // Read each price from the user
        System.out.println("Enter the prices:");
        for (int i = 0; i < n; i++) 
		{
            prices[i] = scn.nextDouble();  // Take user input for each price
        }
        
        // Call the discount method and display the result
        double discountValue = discount(prices);  // Pass the array as varargs
        System.out.println("Total discount: " + discountValue);

	}
	
}