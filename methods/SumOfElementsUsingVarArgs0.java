import java.lang.*;
import java.util.*;

public class SumOfElementsUsingVarArgs0
{	
	//Method to find the maximum number using varargs
	static int sum(int...B)
	{
		int s=0;
		for(int i=0;i<B.length;i++)
		{
			s=s+B[i];
		}
		return s;
	}
	public static void main(String[] args)
	{
		System.out.println(sum(10,20,30,40));
		System.out.println(sum(40,50,99,43));
	}
	
}