import java.lang.*;
import java.util.*;

public class DiscountUsingVarArgs
{	
	static double discount(double...P)
	{
		double s=0;
		
		// Summing up the prices
		for(int i=0;i<P.length;i++)
		{
			s=s+P[i];
		}
		
		// Applying discount based on total sum
		if(s<500) return s*0.10;
        else if(s>=500 && s<1000) return s*0.15;
        else return s*0.20;
	}
	public static void main(String[] args)
	{
		System.out.println(discount(10,20,30,40));
		System.out.println(discount(40,50,99,43));
	}
	
}