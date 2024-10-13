import java.lang.*;
import java.util.*;

public class BinaryOrNot
{
	public static void main(String[] args)
	{
	 int b = 10110001;
	 String str=b+"";
	 //String str=String.valueOf(b);
	 //System.out.println(str.matches("[01]*"));
	 System.out.println(str.matches("[01]+"));
	}
}