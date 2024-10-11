import java.lang.*;
import java.util.Scanner;

public class Printf
{
	public static void main(String[] args)
	{
		int x=10;
		float y=12.56f;
		char z='A';
		
		//System.out.printf("Hello\n");
		//\n will take a new line
		
		System.out.printf("Hello %d %f %c World\n",x,y,z);
	}
}