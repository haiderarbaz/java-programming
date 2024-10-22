import java.lang.*;
import java.util.*;

public class RotatingAnArrayRight
{
	public static void main(String[] args)
	{	
		int A[]={5,9,6,10,12,7,3,5,4,2};
		
		for(int x:A)
		System.out.print(x+",");
		System.out.println("");
		
		int temp=A[A.length-1];
		
		for(int i=A.length-1; i>0;i--)
		{	
			//Being on present location i we copy the elemnet on previous location i.e; i-1 
			A[i]=A[i-1];
		}
		A[0]=temp;
		//At A of first location i.e; length of array-1 there copy temp.
		
		for(int x:A)
		System.out.print(x+",");
		System.out.println("");
	}
}