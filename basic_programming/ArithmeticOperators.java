import java.util.*;

public class ArithmeticOperators
{
	public static void main(String[] args)
	{
		int x=15;
		int y=10;
		//Addition
		int sum=x+y;
		System.out.println("Sum of " + x + " and " + y + " is " +sum);
		//Subtraction
		int sub=x-y;
		System.out.println("Sub of " + x + " and " + y + " is " +sub);
		//Product
		int prd=x*y;
		System.out.println("Prd of " + x + " and " + y + " is " +prd);
		//Division and Modulus
		int v1=x/y;
		int v2=y/x;
		int v3=x%y;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		//Expression
		int exp=x*y/x+y;
		System.out.println(exp);
		int exp0=(x*y)/(x+y);
		System.out.println(exp0);
	}
}