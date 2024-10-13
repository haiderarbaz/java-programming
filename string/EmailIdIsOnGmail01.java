import java.lang.*;
import java.util.*;

public class EmailIdIsOnGmail01
{
	public static void main(String[] args)
	{
		String str="programmer@gmail.com";
		
		int i=str.indexOf("@");
		String uname=str.substring(0,i);
		String domain=str.substring(i+1, str.length());
		
		System.out.println("Username : "+uname);
		System.out.println("Domainname : "+domain);
		
		//To check whether domainname is gmail or not
		
		//1st way
		//System.out.println(domain.startsWith("gmail"));
		
		//2nd way
		int j=domain.indexOf(".");
		String name=domain.substring(0,j);
		System.out.println(name.equals("gmail"));
		
		
	}
}