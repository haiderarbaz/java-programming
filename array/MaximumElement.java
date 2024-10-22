import java.lang.*;
import java.util.*;

public class MaximumElement
{
	public static void main(String[] args)
	{	
		int A[]={3,4,27,5,6,34,7,8};
		
		int max=A[0];
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{	
				max=A[i];
			}
		}
		System.out.println("Maximum value is "+max);
	}
}