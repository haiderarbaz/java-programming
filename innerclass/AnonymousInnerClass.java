import java.lang.*;
import java.util.*;

//abstract
abstract class My
{
	abstract public void show();
}
class Outer
{
	public void display()
	{
		My m=new My()
		{
			public void show()
			{
				System.out.println("Hello");
			}
		};
		m.show();
		
		//new My(){public void show(){System.out.println("Hello");}}.show(); //anonymous object as well as anonymous class.
	}
}

public class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.display();
	}
}