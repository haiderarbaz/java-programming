import java.lang.*;
import java.util.*;

public class RotatingAnArrayLeft
{
	public static void main(String[] args)
	{	
		int A[]={5,9,6,10,12,7,3,5,4,2};
		
		for(int x:A)
		System.out.print(x+",");
		System.out.println("");
		
		int temp=A[0];
		
		for(int i=1;i<A.length;i++)
		{	
			//Being on present location i we copy the elemnet on previous location i.e; i-1 
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		//At A of last location i.e; length of array-1 there copy temp.
		
		for(int x:A)
		System.out.print(x+",");
		System.out.println("");
	}
}