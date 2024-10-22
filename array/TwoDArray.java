import java.lang.*;
import java.util.*;

public class TwoDArray
{
	public static void main(String[] args)
	{
		int A[][]={{1,2,3,4},{2,4,6,8},{3,5,7,9}};
		
		int B[][]= new int[5][5];
		
		int C[][];
		C=new int[5][5];
		
		int [][]D=new int[5][5];
		
		int[][] E=new int[5][5];
		
		int []F[]=new int[5][5];
		
		int[] J,K[];
		//Single dimension
		J=new int[5];
		//Double dimension
		K= new int[5][5];
		
		//here G,H,I are single dimension and L is double dimension
		int[] G,H,I,L[];
		
		
		for (int i=0;i<A.length;i++)
		{
			for(int j=0; j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println("");
		}
		
		for (int x[]:A)
		{
				for (int y:x)
				{
					System.out.print(y+" ");
				}
				System.out.println("");
		}
	}
}