import java.lang.*;
import java.util.*;

public class GCDOrHCF
{	
	static int GCD(int m, int n)
	{
		while(m!=n)
		{
			if (m>n)m=m-n;
			else n=n-m;
		}
		return m;
	}
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scn.nextInt();
		System.out.println("Enter second number");
		int b=scn.nextInt();

			System.out.println("GCD of a & b is "+GCD(a,b));
	}
}