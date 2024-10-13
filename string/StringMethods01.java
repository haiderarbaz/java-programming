import java.lang.*;
import java.util.*;

public class StringMethods01
{
	public static void main(String[] args)
	{
		String str1= new String ("netbeans");
		int len=str1.length();
		
		String str= new String ("Arbaz");
		String str2=str.toLowerCase();
		String str3=str.toUpperCase();
		
		String str4=new String ("  Haider  ");
		String str5=str4.trim();
		
		String sub=str.substring(2);
		
		String sub1=str.substring(2,4);
		
		String rep= str.replace('a','c');
		
		//String str3="java";
		//String str4=new String ("Java");
		
		System.out.println(len);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str5);
		System.out.println(sub);
		System.out.println(sub1);
		System.out.println(rep);
	}
}