import java.util.Scanner;

public class Multiplication {
    public static void multiply(int a, int b){
        int res=a*b;
        System.out.println("The product of the two given number is: "+res);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a =scn.nextInt();
        System.out.println("Enter the second number: ");
        int b =scn.nextInt();

        multiply(a, b);

        scn.close();
    }
}
