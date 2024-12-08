import java.util.*;

public class TernaryOperator{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a valid number: ");
        int n=scn.nextInt();

        int result=0;

        // if (n%2==0)
        // {
        //     System.out.println("Number is Even");
        // }
        // else
        // {
        //     System.out.println("Number is odd");
        // }

        result=n%2==0 ? 20 : 30;
        System.out.println(result);

    }
}