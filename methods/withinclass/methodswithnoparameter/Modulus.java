import java.util.Scanner;

public class Modulus {

    static int a;
    static int b;

    public static void mod(){
        double res=a%b;
        System.out.println("The modulus of a & b is: "+res);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a=scn.nextInt();
        System.out.println("Enter the value of b: ");
        b=scn.nextInt();

        mod();

        scn.close();
    }
}