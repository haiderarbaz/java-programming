import java.lang.*;
import java.util.*;

public class DeletingAnElement 
{
    
    public static void main(String[] args) 
    {	
		Scanner scn= new Scanner(System.in);
		//Array with space for 10 elements
        int A[]=new int[10];
		
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
		//Number of elements in the array
        int n=6;
		
		//Display the original array
		System.out.print("Original Array: ");
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
		
		//input index to display
		System.out.println("Enter the index of the element to delete: ");
		int index=scn.nextInt();
        
		//Shift elements to the left to delete the element
        for(int i=index;i<n-1;i++)
            A[i]=A[i+1];
		
		//Decrease the size of the array (n becomes smaller by 1)
        n--;
        
		// Display the array after deletion
		System.out.print("Array after deletion: ");
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
    }
        
}