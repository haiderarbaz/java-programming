import java.lang.*;
import java.util.*;

public class SearhingAnElement
{
	public static void main(String[] args)
	{	
		Scanner scn = new Scanner(System.in);
		int A[]={3,4,27,5,6,34,7,8};
		int key;
		
		System.out.println("Enter a key");
		key = scn.nextInt();
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==key)
			{
				System.out.println("Key is found at index "+i);
				System.exit(0);
			}
		}
		System.out.println("Key is Not found");
	}
}