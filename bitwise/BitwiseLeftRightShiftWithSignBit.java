import java.lang.*;
import java.util.Scanner;

public class BitwiseLeftRightShiftWithSignBit
{	
	public static void main(String[] args)
	{	
		int x=-0b1010,y;
		
		//Right Shift
		
		//Left Shift
		
		//without sign bit
		y=x>>1;
		//o/p: -5;
		
		//with sign bit
		y=x>>>1;
		//o/p: 2147483643;
		
		System.out.println(y);
	}
}