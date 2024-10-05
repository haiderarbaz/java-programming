import java.lang.*;
import java.util.*;

public class DisplayWebsiteTypeAndProtocoloUsed
{
	public static void main(String[] args)
	{
		String str;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the url");
		str = scn.nextLine();
		
		String protocol=str.substring(0, str.indexOf(":"));
		
		if (protocol.equals("http"))
		{
			System.out.println("Hyper Text Transfer Protocol");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		else if (protocol.equals("sftp"))
		{
			System.out.println("Secure file transfer protocol");
		}
		else if (protocol.equals("ssh"))
		{
			System.out.println("Secure Shell");
		}
		
		String ext=str.substring(str.lastIndexOf(".")+1);
		if (ext.equals("com"))
		{
			System.out.println("Commercial");
		}
		else if (ext.equals("net"))
		{
			System.out.println("Network");
		}
		else if (ext.equals("org"))
		{
			System.out.println("Organisation");
		}
		else if (ext.equals("in"))
		{
			System.out.println("India");
		}
	}
}