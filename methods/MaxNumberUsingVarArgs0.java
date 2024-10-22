import java.lang.*;
import java.util.*;

//Reading from keyboard
public class MaxNumberUsingVarArgs0
{	
	//Method to find the maximum number using varargs
	static int max(int...A)
	{
		if(A.length==0)
			return Integer.MIN_VALUE; //If no numbers are passed, return the smallest integer value
		
			int m=A[0]; //Assume the first number is the maximum
			
			//Iterate through the array to find the maximum number
			for(int i=1;i<A.length;i++)
				if(A[i]>m)
			{
				m=A[i];
			}
			return m;
	}
	public static void main(String[] args)
	{	
		Scanner scn = new Scanner(System.in);
		
		// Ask user how many numbers they want to input
        System.out.print("How many numbers do you want to enter? ");
        int n = scn.nextInt();

        // Initialize an array to store the user's numbers
        int[] numbers = new int[n];

        // Input numbers from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) 
		{
            numbers[i] = scn.nextInt();
        }
		
		// Call the max method with user-inputted numbers and display the maximum
        System.out.println("Maximum value is " + max(numbers));
	}
}