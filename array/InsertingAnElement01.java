import java.lang.*;
import java.util.*;

public class InsertingAnElement01 
{
    
    //Inserting an Element 2nd Way
    public static void main(String[] args) 
    {	
		Scanner scn= new Scanner(System.in);
		//Array with space for 10 elements
        int A[]=new int[10];
		
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
		//Number of elements in the array
        int n=6;
        int x; 
		int index;
		
		//Display the original array
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
		
		System.out.println("Enter a Element to insert in Array");
		x=scn.nextInt();
		System.out.println("Enter the index no. where you want to insert the element in Array");
		index=scn.nextInt();
        
		//Shift elements to the right starting from the index
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
		//Insert the new element at the specified index
        A[index]=x;
		
		// Increment n to reflect the new size of the array
        n++;
        
		// Display the array after insertion
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
    }
        
}