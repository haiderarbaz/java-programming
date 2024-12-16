import java.util.Scanner;

public class Addition {

    public static void add(int a, int b){
        int res=a+b;
        System.out.println("Sum of a & b is: "+res);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=scn.nextInt();
        System.out.print("Enter second number: ");
        int b=scn.nextInt();

        add(a,b);
        scn.close();
    }
} 