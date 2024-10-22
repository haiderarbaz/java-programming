import java.lang.*;
import java.util.*;

public class MaxNumberUsingVarArgs
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
		System.out.println("Maximum value is "+max());
		System.out.println("Maximum value is "+max(10));
		System.out.println("Maximum value is "+max(10,20,30));
		System.out.println("Maximum value is "+max(10,20,30,40));
	}
}