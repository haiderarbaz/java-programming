import java.lang.*;
import java.util.*;

public class ReverseCopyingAnArray 
{
    
    public static void main(String[] args) 
    {	
		//Declare and initialize the original array 'A' with 10 elements.
		int A[]={2,3,4,5,6,7,8,9,1,21};
		
		//Declare a new array 'B' to hold the reverse copy of 'A'. It also has space for 10 elements.
		int B[]=new int[10];
		
		//Loop to copy elements from 'A' into 'B' in reverse order.
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			//Copy element from the end of 'A' to the beginning of 'B'.
			B[j]=A[i];
		}
		
		//Print the original array 'A'.
		System.out.println("Original Array: ");
        for (int x : A) 
		{
            System.out.print(x + ",");
        }
		//Print a new line for separation.
		System.out.println("");
		
		//Print the reversed array 'B'.
        System.out.println("Copy Array: ");
        for (int x : B) 
		{
            System.out.print(x + ",");
		}
	}
	
}
	