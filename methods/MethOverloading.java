import java.lang.*;
import java.util.*;

public class MethOverloading
{	
	//static int max(int x, int y)
	//{
	//	return  x>y?x:y;
	//}
	
	static int max(byte x, byte y)
	{
		return  x>y?x:y;
	}
	
	static float max(float x, float y)
	{
		if (x>y)
			return  x;
		else
			return y;
	}
	
	//single method works for integer as well as float because integer is compatible with float
	
	static double max(double x, double y)
	{
		if (x>y)
			return  x;
		else
			return y;
	}
	
	static int max (int x, int y, int z)
	{
		if (x>y && y>z)
			return x;
		else if (y>z)
			return y;
		else
			return z;
	}
	public static void main(String[] args)
	{	
		//System.out.println(max(10,5));
		//System.out.println(max(10.5f,55.5f));
		//System.out.println(max(12.5,57.5)); //by default this parameters will be double
		//System.out.println(max(18,17)); //for this method float methodwill be called
		byte a=14, b=4;
		System.out.println(max(a,b));
		
		System.out.println(max(15, 35, 25));
	}
}

	//float can also work for integer
	//byte works only for byte type of data
	//byte methods will work only if you're passing byte as a parameter