import java.lang.*;
import java.util.*;

//if the value of formal parameter is modified it will not reflect into actual parameter
public class Methods01
{	
	static void inc(int x)
	{	
		x++;
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		int a=10, b=15;
		inc(a);
		
		System.out.println(a); 
	}
}