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
	public void display()
	{
		System.out.println("Sub Class Display");
	}
	
}

public class DynamicDispatch
{
	public static void main(String[] args)
	{
		//Super sup=new Super();
		//sup.display();
		
		//Sub sb=new Sub();
		//sb.display();
		
		Super sup=new Sub();
		sup.display();
	}
}