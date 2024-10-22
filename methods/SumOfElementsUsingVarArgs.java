import java.lang.*;
import java.util.*;

public class SumOfElementsUsingVarArgs
{	
	//Method to find the maximum number using varargs
	static int sum(int...B)
	{
		int s=0;
		for(int i=0;i<B.length;i++)
		{
			s=s+B[i];
		}
		return s;
	}
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to enter?");
		int n = scn.nextInt();
		
		int[] numbers = new int[n];
		
		System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) 
		{
            numbers[i] = scn.nextInt();
        }
		
		System.out.println("Sum of numbers is "+sum(numbers));
	}
	
}