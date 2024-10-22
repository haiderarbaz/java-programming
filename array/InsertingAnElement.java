import java.lang.*;
import java.util.*;

public class InsertingAnElement
{
	//Inserting an Element 1st Way
    public static void main(String[] args) 
    {	
		//Array with space for 10 elements
        int A[]=new int[10];
		
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
		//Number of elements in the array
        int n=6;
        
		//Display the original array
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
		
		//Element to be inserted
        int x=20;
		//Position where element should be inserted
        int index=2;
        
		//Shift elements to the right starting from the index
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
		//Insert the new element at the specified index
        A[index]=x;
        
		// Display the array after insertion
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
	}
}