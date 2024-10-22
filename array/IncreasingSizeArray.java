import java.lang.*;
import java.util.*;

public class IncreasingSizeArray
{
	public static void main(String[] args)
	{
		int A[]={3,2,6,4,7,9};
		System.out.println("Length of A="+A.length);
		
		System.out.println("Original Array: ");
		for (int x:A)
		{
			System.out.print(x+",");
		}
		System.out.println("");
		
		int B[]=new int[10];
		
		for(int i=0; i<A.length; i++)
		{
				B[i]=A[i];
		}
		A=B;
		
		//Optionally, you can add new elements to the new positions
        B[6] = 6;
        B[7] = 7;
		
        //Display the new array
        System.out.println("New Array after increasing size:");
        for (int x : B) {
            System.out.print(x + ",");
        }
		
	}
}