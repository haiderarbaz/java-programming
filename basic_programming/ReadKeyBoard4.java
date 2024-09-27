import java.lang.*;
import java.util.*;

class ReadKeyBoard4
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name=scn.next();
		System.out.println("The name is " + name);
	}
}