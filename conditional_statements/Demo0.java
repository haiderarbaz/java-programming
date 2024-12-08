import java.util.*;

public class Demo0
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the value 0f x:");
        int x=scn.nextInt();
        System.out.print("Enter the value 0f y:");
        int y=scn.nextInt();
        System.out.print("Enter the value 0f z:");
        int z=scn.nextInt();

        if(x>y && x>z)
        {
            System.out.println("Hello");
        }
        else if(y>z)
        {
            System.out.println("Bye");
        }
        else
        {
            System.out.println("GoodBye");
        }
    }
}