import java.lang.*;
import java.util.*;

public class Readkeyboard1
{
	public static void main(String arg[])
	
	{
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		System.out.println("Enter 2 Numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int z=x+y;
		System.out.println("Sum is "+z);
	}
	
}