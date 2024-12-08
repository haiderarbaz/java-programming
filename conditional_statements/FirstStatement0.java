import java.util.*;
import java.lang.*;

public class FirstStatement0
{
	public static void main(String[] args){
		
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the value of n1");
	int n1=scn.nextInt();
	System.out.println("Enter the value of n2");
	int n2=scn.nextInt();
	
	if(n1==n2)
	{
		System.out.println(n1 + " is equal to " +n2);
	}
	else
	{
		if(n1>n2)
		{
			System.out.println(n1 + " is greater than " +n2);
		}
		else
		{
			System.out.println(n1 + " is less than " +n2);
		}
	}
	}
}