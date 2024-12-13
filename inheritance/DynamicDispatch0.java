import java.lang.*;
import java.util.*;

class Super
{
	public void meth1()
	{
		System.out.println("Super Meth1");
	}
	public void meth2()
	{
		System.out.println("Super Meth2");
	}
}

class Sub extends Super
{
	@Override
	public void meth2()
	{
		System.out.println("Sub Meth2");
	}
	public void meth3()
	{
		System.out.println("Sub Meth3");
	}
}

public class DynamicDispatch0
{
	public static void main(String[] args)
	{
		//Super sup=new Super();
		//sup.meth1();
		//sup.meth2();
		
		//Sub sb=new Sub();
		//sb.meth1();
		//sb.meth2();
		//sb.meth3();
		
		//Dynamic Method Dispatch
		Super sup=new Sub();
		sup.meth1();
		sup.meth2();
		//sup.meth3(); //error: cannot find symbol
	}
} 