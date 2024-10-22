import java.lang.*;
import java.util.*;

public class CopyingAnArray 
{
    
    public static void main(String[] args) 
    {
		int A[]={2,3,4,5,6,7,8,9,1,21};
		int B[]=new int[10];
		
		//copy of the array of objects
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		
		//Display both arrays
		System.out.println("Original Array: ");
        for (int x : A) 
		{
            System.out.print(x + ",");
        }
		//Print a new line for separation.
		System.out.println("");
		
        System.out.println("Copy Array: ");
        for (int x : B) 
		{
            System.out.print(x + ",");
		}
	}
	
}
	