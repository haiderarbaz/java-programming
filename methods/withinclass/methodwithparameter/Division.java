import java.util.Scanner;

public class Division {
    public static void div(int x, int y){
        int res=x/y;
        System.out.println("Result: "+res);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int x = scn.nextInt();
        System.out.println("Enter the number: ");
        int y = scn.nextInt();

        div(x, y);

        scn.close();
    }
}
