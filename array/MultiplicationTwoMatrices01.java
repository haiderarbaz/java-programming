import java.lang.*;
import java.util.*;

public class MultiplicationTwoMatrices01
{
	public static void main(String[] args)
	{
		int A[][]={{3,5,9},{7,6,2},{4,3,5}};

		int B[][]={{1,5,2},{6,8,4},{3,9,7}};
		
		int C[][]=new int[3][3];
		
		for(int i=0; i<3; i++)
		//for(int i=0; i<A.length; i++)
		{
			for(int j=0;j<3;j++)
			//for(int j=0;j<A[0].length;j++)
			{
				for(int k=0;k<3;k++)
				{
					C[i][j]=0;
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
		}
		for (int x[]:C)
		{
			for (int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}
}