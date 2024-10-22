import java.lang.*;
import java.util.*;

//calling non-satic method from static
public class Methods00
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
		int a=10, b=15;
		
		Methods00 mp=new Methods00();
		System.out.println(mp.max(a,b));
	}
}