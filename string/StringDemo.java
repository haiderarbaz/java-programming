import java.lang.*;
import java.util.*;

public class StringDemo
{
	public static void main(String[] args)
	{	
		//Using String Literal
		String str1="Java Program";
		
		//Using new keyword
		String str2= new String ("JAVA");
		
		char c[]={'H','e','l','l','o'};
		String str3= new String (c);
		String str8= new String (c,1,4);
		//1 means started from index letter one and 4 means it has taken four letters.
		
		
		byte b[]={65,66,67,68};
		String str4= new String (b);
		String str5= new String (b,2,2);
		String str6= new String (b,1,2);
		String str7= new String (b,1,1);
		//2,1,1 is starting array and 2,2,1 is number of letters you want to form a string or print
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
	}
}