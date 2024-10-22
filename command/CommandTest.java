import java.lang.*;

class CommandTest
{
	public static void main(String args[])
	{	
		//counter control for loop
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
		//for each
		for(String s:args)
		{
			System.out.println(s);
		}

	}
}
