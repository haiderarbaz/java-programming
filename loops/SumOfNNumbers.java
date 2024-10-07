import java.lang.*;
import java.util.*;

public class SumOfNNumbers
{
	public static void main(String args[])
	{
		int i, n, sum=0;
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter a number");
		n = scn.nextInt();
		
		for(i=1; i<=n; i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of "+n+" Number is "+sum);
	}
}