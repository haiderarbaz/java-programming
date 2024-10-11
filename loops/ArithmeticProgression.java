import java.lang.*;
import java.util.*;

public class ArithmeticProgression
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter a");
		int a = scn.nextInt();
		//a is starting term
		
		System.out.println("Enter d");
		int d = scn.nextInt();
		//d is common difference
		
		System.out.println("Enter n");
		int n = scn.nextInt();
		//n is no. of terms you want to println
		
		int term=a;
		//initialy the term is a
		
		for(int i=0; i<n; i++)
		{
			System.out.print(term+",");
			//println will print each number in next line and print will print in the same line side by side
			term=term+d;
			//it will change term by adding common difference
		}
		
	}
}