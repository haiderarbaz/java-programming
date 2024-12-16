import java.util.Scanner;

public class Multiply {
    
    static int a;
    static int b;

    public static void multi(){
        int res=a*b;
        System.out.println("The product of a & b is: "+res);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a=scn.nextInt();
        System.out.println("Enter the value of b: ");
        b=scn.nextInt();

        multi();


        scn.close();
    }
}
