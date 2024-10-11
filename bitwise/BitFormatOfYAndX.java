import java.lang.*;
import java.util.Scanner;

public class BitFormatOfYAndX
{	
	public static void main(String[] args)
	{	
		int x=-0b1010,y;
		
		y=x>>1;
		//OP: 11111111111111111111111111111011
		
		System.out.println(String.format("%s",Integer.toBinaryString(x)));
		System.out.println(String.format("%s",Integer.toBinaryString(y)));
	}
}