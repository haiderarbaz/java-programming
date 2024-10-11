import java.lang.*;
import java.util.Scanner;

public class BitFormatOfYAndX
{	
	public static void main(String[] args)
	{	
		int x=-0b1010,y;
		
		//without sign bit
		//y=x>>1;
		
		//with sign bit
		y=x>>>1;
		
		System.out.println(String.format("%s",Integer.toBinaryString(x)));
		//System.out.println(String.format("%s",Integer.toBinaryString(y)));
		System.out.println(String.format("%32s",Integer.toBinaryString(y)));
	}
}