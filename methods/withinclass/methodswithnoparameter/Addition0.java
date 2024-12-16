import java.util.Scanner;

public class Addition0 {

    static int x;
    static int y;

    public static void add(){
        int res=x+y;
        System.out.println("Addition of x & y is: " +res);
        return;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        x=scn.nextInt();
        System.out.print("Enter the value of y: ");
        y=scn.nextInt();

        add();

        scn.close();
    }
}
