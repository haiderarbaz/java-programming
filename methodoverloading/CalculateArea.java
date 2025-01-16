import java.util.Scanner;

class CalculateAreaa{
    int area(int length, int breadth){
        return length*breadth;
    }
    int area(int sides){
        return sides*sides;
    }
    double area(double b, double h){
        return (b*h)/2;
    }
    double area(double radius){
        return Math.PI*radius*radius;
    }

}

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        CalculateAreaa calar=new CalculateAreaa();

        System.out.println("Enter sides of Rectangle: ");
        int length=scn.nextInt();
        int breadth=scn.nextInt();
        int res=calar.area(length, breadth);
        System.out.println("Area of rectangle is: "+res);

        System.out.println("Enter sides of Square: ");
        int sides=scn.nextInt();
        int res1=calar.area(sides);
        System.out.println("Area of square is: "+res1);

        System.out.println("Enter sides of Triangle: ");
        double b=scn.nextFloat();
        double h=scn.nextFloat();
        double res3=calar.area(b, h);
        System.out.println("Area of triangle is: "+res);

        System.out.println("Enter radius of circle: ");
        double radius=scn.nextFloat();
        double res4=calar.area(radius);
        System.out.println("Area of circle is: "+res4);

        scn.close();
    }
}
