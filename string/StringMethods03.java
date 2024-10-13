import java.lang.*;
import java.util.*;

public class StringMethods03
{
	public static void main(String[] args)
	{
		String str1= "Pyramid";
		String str2= "Pyramid";
		String str3= "pyramid";
		
		String str4= new String ("Pyramid");
		
		String str5= new String ("china wall");
		
		String str6= new String ("china tall");
		
		String str7= new String ("china all");
		
		String str8= new String ("the great wall of china");
		
		String str9= new String ("india is");
		String str10= new String (" great");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
		
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str3));
		System.out.println(str3.compareTo(str1));
		
		System.out.println(str3.compareTo(str5));
		System.out.println(str5.compareTo(str3));
		System.out.println(str5.compareTo(str6));
		System.out.println(str5.compareTo(str7));
		
		System.out.println(str8.contains("wall"));
		
		System.out.println(str9.concat(str10));
		System.out.println(str9 + str10);
	}
}