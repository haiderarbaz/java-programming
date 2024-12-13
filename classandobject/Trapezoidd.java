import java.util.Scanner;

class Trapezoid{
    public int sidea;
    public int sideb;
    public int verticalheight;

    public int area(){
        return ((sidea*sideb)*verticalheight)/2;
    }

}

public class Trapezoidd {
    public static void main(String[] args) {
         
        Scanner scn = new Scanner(System.in);

        Trapezoid t1=new Trapezoid();
        Trapezoid t2=new Trapezoid();

        System.out.println("Enter sidea of first Trapezoid: ");
        t1.sidea=scn.nextInt();
        System.out.println("Enter sideb of first Trapezoid: ");
        t1.sideb=scn.nextInt();
        System.out.println("Enter verticalheight of first Trapezoid: ");
        t1.verticalheight=scn.nextInt();

        System.out.println("Area of first Trapezoid: " +t1.area());

        System.out.println("Enter sidea of first Trapezoid: ");
        t2.sidea=scn.nextInt();
        System.out.println("Enter sideb of first Trapezoid: ");
        t2.sideb=scn.nextInt();
        System.out.println("Enter verticalheight of first Trapezoid: ");
        t2.verticalheight=scn.nextInt();

        System.out.println("Area of second Trapezoid: " +t2.area());

        scn.close();
    }
}
