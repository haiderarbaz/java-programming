import java.util.Scanner;

class Parallelogram{

    public double base;
    public double verticalheight;

    public double area(){
        return base*verticalheight;
    }

}

public class Parallelogramm {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        Parallelogram p1=new Parallelogram();
        Parallelogram p2=new Parallelogram();
        Parallelogram p3=new Parallelogram();

        System.out.print("Enter the base of first Parallelogram: ");
        p1.base=scn.nextDouble();
        System.out.print("Enter the verticalheight of first Parallelogram: ");
        p1.verticalheight=scn.nextDouble();

        System.out.println("Area of first Parallelogram: " +p1.area());

        System.out.print("Enter the base of second Parallelogram: ");
        p2.base=scn.nextDouble();
        System.out.print("Enter the verticalheight of second Parallelogram: ");
        p2.verticalheight=scn.nextDouble();

        System.out.println("Area of second Parallelogram: " +p2.area());

        System.out.print("Enter the base of third Parallelogram: ");
        p3.base=scn.nextDouble();
        System.out.print("Enter the verticalheight of third Parallelogram: ");
        p3.verticalheight=scn.nextDouble();
        
        System.out.println("Area of third Parallelogram: " +p3.area()); 


        scn.close();
    }
    
}