import java.lang.*;
import java.util.*;

interface Test
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
	private void meth6() //they're useful only inside interface
	{
		System.out.println("Meth6 of Test");
	}
	default void meth4()
	{
		meth6();
		System.out.println("Meth3 of Test");
	}
}

interface Test2 extends Test
{
    void meth5();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
	public void meth3(){System.out.println("Meth3");}
    public void meth4(){System.out.println("Meth4");}
	public void meth5(){System.out.println("Meth5");}
}
public class DosDontsOfInterface 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);
        Test.meth3();
		My m=new My();
		m.meth4();
        
    }
}
