import java.util.Scanner;

public class Subtraction {
    public static void subs(int a, int b){
        int res=a-b;
        System.out.println("The subtraction of the two number is: "+res);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter first value: ");
        int a=scn.nextInt();
        System.out.println("Enter second value: ");
        int b=scn.nextInt();

        subs(a,b);

        scn.close();
    }
}
