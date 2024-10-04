import java.lang.*;
import java.util.Scanner;

public class AreaOfParallelogram
	{
		public static void main(String[] args)
		{
			int b, h;
			double area;
			
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter base of Parallelogram");
			b = scn.nextInt();
			
			System.out.println("Enter vertical height of the Parallelogram");
			h= scn.nextInt();
			
			area = b*h;
			System.out.println("Area of Parallelogram " + area);
		}
	}