import java.lang.*;
import java.util.*;

public class TakeInput1
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = Integer.parseInt(scn.nextLine());
		System.out.println("Enter the name of person:");
		String name=scn.nextLine();
		System.out.println("Hello " + name + ".Here is the counting for you");
		for(int i=0; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}
		