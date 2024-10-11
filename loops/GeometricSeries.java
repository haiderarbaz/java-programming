import java.lang.*;
import java.util.Scanner;

public class GeometricSeries
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a");
		int a = scn.nextInt();
		
		System.out.println("Enter r");
		int r = scn.nextInt();
		
		System.out.println("Enter n");
		int n = scn.nextInt();
		
		int term=a;
		for (int i=0; i<n; i++)
		{
			System.out.print(term+",");
			term=term*r;
		}
	}
}