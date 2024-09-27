import java.lang.*;
import java.util.*;

class ReadKeyBoard3
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner (System.in);
		
		float p,q,r,s;
		System.out.println("Enter three number");
		p=scn.nextFloat();
		q=scn.nextFloat();
		r=scn.nextFloat();
		s=p+q+r;
		System.out.println("Sum of three number is " + s);
	}
}