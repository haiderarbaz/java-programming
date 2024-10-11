import java.lang.*;
import java.util.Scanner;

public class BitwiseDemo
{	
	public static void main(String[] args)
	{	
		int x=0b1010, y=0b0110, z;
		//z=x&y;
		//AND Operator	
		//z=x|y;
		//OR Operator
		z=x^y;
		//XOR Operator
		
		System.out.println(z);
	}
}