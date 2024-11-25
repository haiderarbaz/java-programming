import java.lang.*;
import java.util.*;

abstract class Super
{
	public Super()
	{
		System.out.println("Super Constructor");
	}
	public void meth1()
	{
		System.out.println("Meth of Super");
	}
	abstract public void meth2();
}

class Sub extends Super
{
	public void meth2()
	{
		System.out.println("Sub Meth2");
	}
}

public class AbstractExample
{
	public static void main(String[] args)
	{
		Super s=new Sub();
		s.meth1();
		s.meth2();
	}
}