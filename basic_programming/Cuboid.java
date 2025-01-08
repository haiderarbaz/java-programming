import java.util.*;

public class Cuboid{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter length,breadth and heigth of Cuboid: ");
        int l=scn.nextInt();
        int b=scn.nextInt();
        int h=scn.nextInt();

        int TSA=2*((l*b)+(b*h)+(l*h));
        int LSA=(2*h)*(l+b);
        int volume=l*b*h;
        int perimeter=4*(l+b+h);
        double diagonals=Math.sqrt((l*l)+(b*b)+(h*h));

        System.out.println("Total Surface Area of Cuboid: "+TSA);
        System.out.println("Lateral Surface Area of Cuboid: "+LSA);
        System.out.println("Volume of Cuboid: "+volume);
        System.out.println("Perimeter of Cuboid: "+perimeter);
        System.out.println("Diagonals of Cuboid: "+diagonals);

        scn.close();
    }
}