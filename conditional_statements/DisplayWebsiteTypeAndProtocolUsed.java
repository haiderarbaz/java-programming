import java.lang.*;
import java.util.*;

public class DisplayWebsiteTypeAndProtocolUsed
{
	public static void main(String[] args)
	{
		String str;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the url");
		str = scn.nextLine();
		
		String protocol=str.substring(0, str.indexOf(":"));
		
		switch(protocol)
		{
			case "https":System.out.println("Hyper Text Transfer Protocol");
					break;
			case "ftp":System.out.println("File Transfer Protocol");
					break;
			case "sftp":System.out.println("Secure file transfer protocol");
					break;
			case "ssh":System.out.println("Secure Shell");
					break;
			default: System.out.println("Invalid Protocol");
					break;
		}
		
		String ext=str.substring(str.lastIndexOf(".")+1);
		
		switch(ext)
		{
			case "com":System.out.println("Commercial");
					break;
			case "net":System.out.println("Network");
					break;
			case "org":System.out.println("Organisation");
					break;
			case "gov":System.out.println("Government");
					break;
			default: System.out.println("Invalid Extension");
					break;
		}
	}
}