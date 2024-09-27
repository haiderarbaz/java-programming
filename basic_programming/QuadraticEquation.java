import java.lang.*;
import java.util.*;

class QuadraticEquation
{
	public static void main(String[] args)
	{
		int a,b,c;
		double r1,r2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b,c");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		r1=(-b+Math.sqrt(b*b-4*a*c))*0.5*a;
		System.out.println("r1 value is " +r1);
		
		r2=(-b-Math.sqrt(b*b-4*a*c))*0.5*a;
		System.out.println("r2 value is " +r2);
	}
}