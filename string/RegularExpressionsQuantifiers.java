import java.lang.*;
import java.util.*;

public class RegularExpressionsQuantifiers
{
	public static void main(String[] args)
	{
		String str1="abcdef";
		String str2="abcdef ";
		String str3="ab6cdef";
		String str4="aB6cdef";
		String str5="abcbbccbaaaacccc";
		String str6="";
		String str7="acc";
		String str8="ac";
		String str9="accc";
		String str10="accb";
		String str11="accbaaa";
		String str12="accbaaab";
		String str13="john@gmail.com";
		String str14="joh-n@gmail.com";
		
		
		
		System.out.println(str1.matches(".*"));
		System.out.println(str2.matches(".*"));
		System.out.println(str1.matches("[a-z]*"));
		System.out.println(str3.matches("[a-z]*"));
		System.out.println(str4.matches("[a-z]*"));
		System.out.println(str5.matches("[abc]*"));
		System.out.println(str5.matches("[abc]+"));
		System.out.println(str6.matches("[abc]*"));
		System.out.println(str6.matches("[abc]+"));
		System.out.println(str7.matches("[abc]{3}"));
		System.out.println(str8.matches("[abc]{3}"));
		System.out.println(str9.matches("[abc]{3}"));
		System.out.println(str10.matches("[abc]{3,7}"));
		System.out.println(str11.matches("[abc]{3,7}"));
		System.out.println(str12.matches("[abc]{3,7}"));
		System.out.println(str13.matches(".*gmail.*"));
		System.out.println(str13.matches("\\w*@gmail.*"));
		//System.out.println(str13.matches("\\w*@gmail(.*)"));
		System.out.println(str14.matches("\\w*@gmail.*"));
	}
}