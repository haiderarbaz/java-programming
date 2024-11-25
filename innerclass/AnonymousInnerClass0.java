import java.lang.*;
import java.util.*;

//interface
interface My
{
	public void show();
}
class Outer
{
	public void display()
	{
		new My(){public void show(){System.out.println("Hello");}}.show(); //anonymous object as well as anonymous class.
	}
}

public class AnonymousInnerClass0
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.display();
	}
}