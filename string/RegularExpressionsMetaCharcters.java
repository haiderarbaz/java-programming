import java.lang.*;
import java.util.*;

public class RegularExpressionsMetaCharcters
{
	public static void main(String[] args)
	{
		String str1="a";
		String str2="8";
		String str3="6";
		String str4="$";
		String str5=" ";
		
		System.out.println(str1.matches("\\w"));
		System.out.println(str2.matches("\\w"));
		System.out.println(str1.matches("\\d"));
		System.out.println(str3.matches("\\d"));
		System.out.println(str1.matches("\\D"));
		System.out.println(str4.matches("\\D"));
		System.out.println(str4.matches("\\W"));
		System.out.println(str4.matches("\\s"));
		System.out.println(str5.matches("\\s"));
		System.out.println(str5.matches("\\S"));

	}
}