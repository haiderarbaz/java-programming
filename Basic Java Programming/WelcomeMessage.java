import java.lang.*;
import java.util.*;

public class Welcomemessage
{
		public static void main(String arg[])
		{
			String name;
			Scanner sc=new Scanner (System.in);
			
			System.out.println("May I Know Your Name");
			name=sc.nextLine();
			System.out.println("Welcome "+name);

		}
}