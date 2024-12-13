import java.util.Scanner;

class Square{
    public int side;
    public int area(){
        return side*side;
    }
}

public class Squaree {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);    
        
        Square s1=new Square();
        Square s2=new Square();

        System.out.println("Enter side of first Square");
        s1.side=scn.nextInt();

        System.out.println("Area of first Square: " +s1.area());

        System.out.println("Enter side of second Square");
        s2.side=scn.nextInt();

        System.out.println("Area of second Square: " +s2.area());

        scn.close();
    }
}
