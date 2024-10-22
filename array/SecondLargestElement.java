import java.lang.*;
import java.util.*;

public class SecondLargestElement
{
	public static void main(String[] args)
	{	
		int A[]={3,4,27,5,6,34,7,8};
		
		int max1,max2;
		
		max1=max2=A[0];
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max1)
			{	
				//if A[i] is greater than max1 then max2 we will stored in max1
				max2=max1;
				//then in max1 we will assign A[i];
				max1=A[i];				
			}
			else if(A[i]>max2)
			{	
				//if A[i] is greater than max2 then chnage max2 to A[i] if the element is not greaterthan max1 then it will may be greter than max2 we will check that also.
				max2=A[i];
			}
		}
		System.out.println("Second largest element is "+max2);
	}
}