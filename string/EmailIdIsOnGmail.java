import java.lang.*;
import java.util.*;

public class EmailIdIsOnGmail
{
	public static void main(String[] args)
	{
		String str="programmer@gmail.com";
		
		System.out.println(str.contains("gmail"));
		
		System.out.println(str.indexOf("@"));
		System.out.println(str.substring(0,10));
		System.out.println(str.substring(11,20));
		
	}
}