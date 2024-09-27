import java.lang.*;
import java.utli.*;

class ReadKeyBoard8
{
 public static void main(String[] args)
 {
	Scanner scn = new Scanner(System.in);
	
	scn.useRadix(2);
	
	int x = scn.nextInt();
	
	System.out.println(x);
	}
}