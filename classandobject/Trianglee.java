import java.util.Scanner;

class Triangle{
    public int base;
    public int height;

    public double area(){
        return (base*height)/2;
    }
}

public class Trianglee {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        Triangle t1=new Triangle();
        Triangle t2=new Triangle();

        System.out.println("Enter base of first Triangle: ");
        t1.base=scn.nextInt();
        System.out.println("Enter height of first Triangle: ");
        t1.height=scn.nextInt();

        System.out.println("Area of first Triangle: " +t1.area());

        System.out.println("Enter base of second Triangle: ");
        t2.base=scn.nextInt();
        System.out.println("Enter height of second Triangle: ");
        t2.height=scn.nextInt();

        System.out.println("Area of second Triangle: " +t2.area());

        scn.close();
    }
}
