import java.lang.*;
import java.util.*;

class ReadKeyBoard2
{
	public static void main(String[] args)
	
	{
		Scanner scn = new Scanner(System.in);
		
		int x,y,z;
		System.out.println("Enter two numbers");
		x = scn.nextInt();
		y = scn.nextInt();
		z = x+y;
		
		System.out.println("Sum is " + z);
		
	}
		
}