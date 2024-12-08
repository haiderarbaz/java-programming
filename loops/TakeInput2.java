import java.lang.*;
import java.util.*;

public class TakeInput2
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number for counting:");
		int n=Integer.parseInt(scn.nextLine());
		System.out.println("Please enter your name:");
		String name=scn.nextLine();
		System.out.println("Hello " + name + ".Here is the counting for you");
		for(int i=0; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}
		