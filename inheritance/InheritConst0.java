import java.lang.*;
import java.util.*;

//using parametrised constructor
class Parent
{
	public Parent()
	{
		System.out.println("Non-Param of Parent");
	}
	public Parent(int x)
	{
		System.out.println("Param of Parent "+x);
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("Non-Param of Child");
	}
	public Child(int y)
	{
		System.out.println("Param of Child");
	}
	public Child(int x,int y)
	{	
		super(x);
		System.out.println("2 Param of Child "+y);
		
	}
}
class GrandChild extends Child
{
	public GrandChild()
	{
		System.out.println("Non-Param of GrandChild");
	}
	public GrandChild(int z)
	{
		System.out.println("Param of GrandChild");
	}
}

public class InheritConst0
{
	public static void main(String[] args)
	{
		Child g=new Child(40, 60);
	}
}