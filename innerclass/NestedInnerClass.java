import java.lang.*;
import java.util.*;

class Outer
{
	int x=10;
	//Inner i=new Inner(); //this will be available for all method of outer class.
	class Inner
	{
		static int y=20;
		public void innerDisplay()
		{
			System.out.println(x+" "+y);
		}
	}
	public void outerDisplay()
	{
		Inner i=new Inner(); //this will be only available for outerDisplay method.
		i.innerDisplay();
		System.out.println(i.y);
	}
}

public class NestedInnerClass
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.outerDisplay();
		Outer.Inner oi=new Outer().new Inner();
		oi.innerDisplay();
	}
}