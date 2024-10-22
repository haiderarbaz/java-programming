import java.lang.*;
import java.util.*;

public class OverloadedMethReverseArrayOrInteger
{	
	static int reverse(int n)
	{
		int r, rev=0; //'r' is used to hold the remainder, 'rev' holds the reversed number
		while (n>0)
		{
			r=n%10; //Extract the last digit of 'n'
			rev=rev*10+r; //Add the extracted digit to 'rev'
			n=n/10; //Remove the last digit from 'n'
		}
		return rev;
	}
	
	static int[] reverse(int A[])
	{
		int B[]= new int[A.length]; // Create a new array to store the reversed elements
		
		for(int i=A.length-1, j=0; i>=0;i--,j++)
			B[j]=A[i]; //Copy the elements from A[] to B[] in reverse order
		return B; //Return the reversed array
	}
	public static void main(String[] args)
	{	
		// Reversing an integer
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int rev=reverse(n);
		System.out.println("Reverse of a Number "+rev);
		
		// Reversing an array
		System.out.println("Enter the size of the array:");
		int size = scn.nextInt();
		int A[] = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			A[i] = scn.nextInt(); // Read array elements from the user
		}

		int B[] = reverse(A); // Call the reverse method for array
		System.out.println("Reversed array: ");
		for (int x : B) {
			System.out.print(x + " "); // Print the reversed array
		}
		System.out.println();
		
	}
}