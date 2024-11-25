import java.lang.*;
import java.util.*;

//Compile time polymorphism 
//Achieve using Overloading Method
class Test
{
	public int max(int a, int b)
	{
		return a>b?a:b;
	}
	public int max(int a, int b, int c)
	{
		if (a>b && b>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else
			return c;
	}
}
public class CompilePolymorphism
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.max(10,5);
		t.max(10,5,5);
	}
}