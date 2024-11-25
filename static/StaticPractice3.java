import java.lang.*;
import java.util.*;

//Static Block
class Test
{
	static
	{
		System.out.println("Block 1");
	}
	static
	{
		System.out.println("Block 2");
	}
}
public class StaticPractice3
{
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println("Main");
	}
}