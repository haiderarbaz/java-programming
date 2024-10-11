import java.lang.*;
import java.util.Scanner;

public class BitwiseLeftRightShift
{	
	public static void main(String[] args)
	{	
		//int x=0b1, 
		int x=0b1000,y;
		
		//Right Shift
		
		//y=x<<1;
		//o/p: 16
		
		//y=x<<2;
		//o/p: 32
		
		//Left Shift
		
		//y=x>>2;
		//o/p: 2
		
		y=x>>1;
		//o/p: 4;
		System.out.println(y);
	}
}