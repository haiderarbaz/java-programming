import java.lang.*;
import java.util.*;

public class ArrayPractice
{
	public static void main(String[] args)
	{
		int A[]=new int[10];
		
		int B[]={2,3,5,7};
		
		int C[];
		C=new int[10];
		
		//int[] D=new int[5];
		
		B[2]=15;
		
		System.out.println(A.length);
		System.out.println(B.length);
		System.out.println(C.length);
		
		for(int i=0; i<A.length; i++)
		{
			System.out.println(A[i]);
		}
		
		for(int i=0; i<B.length; i++)
		{
			System.out.println(B[i]);
		}
		
		//for-each loop
		for( int x:C)
		{
			System.out.println(x);
		}
		
		for(int i=0; i<B.length; i++)
		{
			System.out.println(B[i]++);
		}
		
		for( int x:B)
		{
			System.out.println(x);
		}
	}
}