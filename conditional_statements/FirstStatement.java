import java.util.*;
import java.lang.*;

public class FirstStatement
{
	public static void main(String[] args)
	{	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=scn.nextInt();
		
		
		if(x%2==0)
		{
			System.out.println("X is Even");
		}
		else
		{
			System.out.println("X is Odd");
		}
	}
}
