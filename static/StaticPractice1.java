import java.lang.*;
import java.util.*;

//Static Block
public class StaticPractice1
{
	static
	{
		System.out.println("Block 1");
	}
	public static void main(String[] args)
	{
		System.out.println("Main");
	}
	static
	{
		System.out.println("Block 2");
	}
}