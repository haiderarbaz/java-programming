import java.lang.*;
import java.util.*;

public class RegularExpressionsMatchingSymbols
{
	public static void main(String[] args)
	{
		String str1="f";
		//String str1="8";
		//String str1="%";
		//String str1="abc";
		
		String str2="b";
		//String str2="ab";
		
		String str3="p";
		
		//String str4="p";
		//String str4="7";
		//String str4="%";
		String str4="A";
		
		//String str5="a";
		//String str5="k%";
		String str5="a7";
		
		String str6="a";
		//String str6="a7";
		
		String str7="abc";
		//String str7="ac";
		//String str7="abcd";
		
		System.out.println(str1.matches("."));
		System.out.println(str2.matches("[abc]"));
		System.out.println(str3.matches("[^abc]"));
		System.out.println(str4.matches("[a-zA-z0-9]"));
		System.out.println(str5.matches("[a-z][0-9]"));
		System.out.println(str6.matches("a|b"));
		System.out.println(str7.matches("abc"));
	}
}