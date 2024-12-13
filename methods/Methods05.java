import java.lang.*;
import java.util.*;

//how objects are passed as methods
public class Methods05
{	
	//here X[] is formal parameter
	//when you pass a object as a parameter to a method then it's refrence is passed.
	static void change(int X[],int index,int value)
	{	
		X[index]=value;
	}
	
	//primitive parameter passing
	//here x will change in formal parameter actual parameter x will not modified
	//when you pass primitives they are pass like value 
	static void change2(int x, int value)
	{
		x=value;
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
		
		int x=10;
		change2(x,20);
		System.out.println("Value of Primitive: "+x);
		
	}	
}