import java.lang.*;

public class ConditionalStates

	{
		public static void main(String[] args)
		{
			int a=5,b=9,c=7;
			
			if(a>b && a>c)
			{
				System.out.println(a);
			}
			else if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
	}