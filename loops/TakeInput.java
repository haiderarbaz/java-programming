import java.lang.*;
import java.util.*;

public class TakeInput
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=scn.nextInt();
		for(int i=0; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}
		