import java.lang.*;
import java.util.*;

//Run time polymorphism 
//Achieve using Overriding Method
class Super
{
	public void display()
	{
		System.out.println("Super Display");
	}
}
class Sub extends Super
{
	public void display()
	{
		System.out.println("Sub Display");
	}
}
public class RunTimePolymorphism
{
	public static void main(String[] args)
	{
		Super sup=new Sub();
		sup.display();
	}
}