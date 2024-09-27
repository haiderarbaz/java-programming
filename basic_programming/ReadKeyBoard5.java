import java.lang.*;
import java.util.*;

class ReadKeyBoard5
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner (System.in);
		String name;
		System.out.println("Enter your name");
		name=scn.next();
		System.out.println("Welcome " + name);
	}
}