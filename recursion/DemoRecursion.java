import java.lang.*;

public class DemoRecursion
{
	static void fun(int n)
	{	
		if(n>0)
		{	
			System.out.println(n);
			fun(n-1);
		}
	}
	
	static void sun(int n)
	{	
		if(n>0)
		{	
			fun(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args)
	{
		fun(3);
		sun(3);
	}
}