import java.lang.*;
import java.util.*;

//how objects are passed as methods
public class Methods02
{	
	static void update(int A[])
	{	
		A[0]=25;
	}
	public static void main(String[] args)
	{
		int A[]={2,4,6,8,10};
		update(A);
		
		System.out.println(A[0]); 
	}
}