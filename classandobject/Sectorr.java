import java.util.Scanner;

class Sector{
    public double radius;
    public double angle;
    public double pi=3.14;

    public double area(){
        return ((pi*radius*radius)*(angle/360))/2;
    }
}

public class Sectorr {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        Sector s1=new Sector();
        Sector s2=new Sector();
        Sector s3=new Sector();

        System.out.print("Enter the radius of first Sector: ");
        s1.radius=scn.nextDouble();
        System.out.print("Enter the angle of first Sector: ");
        s1.angle=scn.nextDouble();

        System.out.println("Area of first Sector: " +s1.area());

        System.out.print("Enter the radius of second Sector: ");
        s2.radius=scn.nextDouble();
        System.out.print("Enter the angle of second Sector: ");
        s2.angle=scn.nextDouble();

        System.out.println("Area of second Sector: " +s2.area());

        System.out.print("Enter the radius of third Sector: ");
        s3.radius=scn.nextDouble();
        System.out.print("Enter the angle of third Sector: ");
        s3.angle=scn.nextDouble();

        System.out.println("Area of third Sector: " +s2.area());
        

        scn.close();
    }
}
