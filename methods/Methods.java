import java.lang.*;
import java.util.*;

//calling satic method to static
public class Methods
{	
	static int max(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[] args)
	{
		int a=10, b=15, c;
		
		//first way
		c=max(a,b);
		System.out.println(c);
		
		//second way
		System.out.println(max(a,b));
	}
}