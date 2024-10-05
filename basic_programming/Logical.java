import java.lang.*;

public class Logical
	{
		public static void main(String[] args)
		{
			int a=14,b=21,c=28;
			
			//AND Operator
			System.out.println(a>b && a>c);
			System.out.println(a>b && a<c);
			System.out.println(a<b && a>c);
			System.out.println(a<b && a<c);
			System.out.println(b>a && b>c);
			System.out.println(b>a && b<c);
			System.out.println(c>b && c>a);
			System.out.println(c<b && c<a);
			
			//OR Operator
			System.out.println(a>b || a>c);
			System.out.println(a>b || a<c);
			System.out.println(a<b || a>c);
			System.out.println(a<b || a<c);
		}
	}