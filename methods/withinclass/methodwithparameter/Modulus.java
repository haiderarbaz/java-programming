import java.util.Scanner;

public class Modulus {
    public static void mod(int a, int b){
        int res=a%b;
        System.out.println("The modulus of two number is: "+res);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int a = scn.nextInt();
        System.out.println("Enter the second value: ");
        int b = scn.nextInt();

        mod(a, b);

        scn.close();
    }
}
