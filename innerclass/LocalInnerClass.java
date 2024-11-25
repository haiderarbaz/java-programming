import java.lang.*;
import java.util.*;

class Outer
{
	public void display()
	{
		class Inner
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}
		Inner i=new Inner();
		i.show();
		//new Inner().sow(); //this will create an object and it will call the method. This object will be useful only for this line. And this object is anonymous object.
	}
}

public class LocalInnerClass
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.display();
	}
}