import java.lang.*;
import java.util.*;

//how objects are passed as methods
public class Methods04
{	
	//here X[] is formal parameter and we are assuming it as another array but in real this is not another array this X[] is referring to the same A[] bcoz this array is an object
	static void change(int X[],int index,int value)
	{	
		X[index]=value;
	}
	public static void main(String[] args)
	{
		//her A[] is actual parameter
		int A[]={2,4,6,8,10};
		change(A,2,20);
		
		for (int x:A)
		{
			System.out.println(x);
		}
	}	
}