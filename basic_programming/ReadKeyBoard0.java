import java.lang.*;
import java.util.*;

class ReadKeyBoard0
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String name;
		System.out.println("May I KNow Your Name?");
		name=s.nextLine();
		System.out.println("Welcome Mr/Mrs" + name);
	}
}