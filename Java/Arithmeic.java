import java.lang.*;

class Arithmeic
{
	public static void main(String[] args)
	{
		//integer
		
		/*int a=14,b=5;
		int c=a/b;
		int r=a%b;
		
		System.out.println(c);
		System.out.println(r);*/
		
		//integerfloat
		
		/*int a=14,b=5;
		float c=(float)a/b;
		int r=a%b;
		
		System.out.println(c);
		System.out.println(r);*/
		
		//float
		
		/*float a=14.3f,b=3.2f;
		float c=(float)a/b;
		float r=a%b;
		
		System.out.println(c);
		System.out.println(r);*/
		
		//Expression
		byte a=10;
		short b=15;
		
		//byte c=a+b; //incompatible types: possible lossy conversion from int to byte
		//short c=a+b; //incompatible types: possible lossy conversion from int to short
		int c=a+b;
		System.out.println(c);
	}
}