import java.util.Scanner;

public class Division {
    
    static int a;
    static int b;

    public static void div(){
        double res=a/b;
        System.out.println("The division of a & b is: "+res);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a=scn.nextInt();
        System.out.println("Enter the value of b: ");
        b=scn.nextInt();

        div();

        scn.close();
    }

}
