import java.util.Scanner;

class Ellipse{
    public double a;
    public double b;
    public double pi=3.14;

    public double area(){
        return pi*a*b;
    }
}

public class Ellipsee {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        Ellipse e1=new Ellipse();
        Ellipse e2=new Ellipse();
        Ellipse e3=new Ellipse();

        System.out.print("Enter half of minor axis of first Ellipse: ");
        e1.a=scn.nextDouble();
        System.out.print("Enter half of major axis of first Ellipse: ");
        e1.b=scn.nextDouble();

        System.out.println("Area of first Ellipse: " +e1.area());

        System.out.print("Enter half of minor axis of second Ellipse: ");
        e2.a=scn.nextDouble();
        System.out.print("Enter half of minor axis of second Ellipse: ");
        e2.b=scn.nextDouble();

        System.out.println("Area of second Ellipse: " +e2.area());

        System.out.print("Enter half of minor axis of third Ellipse: ");
        e3.a=scn.nextDouble();
        System.out.print("Enter half of minor axis of third Ellipse: ");
        e3.b=scn.nextDouble();
        
        System.out.println("Area of third Ellipse: " +e3.area());

        scn.close();
    }
    
}