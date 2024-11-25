import java.lang.*;
import java.util.*;

class Super
{
	public void display()
	{
		System.out.println("Super Class Display");
	}
}
class Sub extends Super
{
	@Override
	public void display()
	{
		System.out.println("Sub Class Display");
	}
	
	//if you will pass a arguments then supar class method will be called
	//public void display(int x)
	//{
		//System.out.println("Sub Class Display");
	//}
}

public class Overriding
{
	public static void main(String[] args)
	{
		Super sup=new Super();
		sup.display();
		
		Sub sb=new Sub();
		sb.display();
		
	}
}
