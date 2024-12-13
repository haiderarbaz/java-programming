import java.util.Scanner;

class Calculator{

    public int a;
    public int b;

    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int mul(){
        return a*b;
    }
    public double div(){
        return a/b;
    }
    public double mod(){
        return a%b;
    }
}


public class Calculatorr {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        Calculator c1=new Calculator();

        System.out.println("Enter first number: ");
        c1.a=scn.nextInt();
        System.out.println("Enter second number: ");
        c1.b=scn.nextInt();


        int Addition=c1.add();
        int Subtraction=c1.sub();
        int Multiplication=c1.mul();
        double Division=c1.div();
        double Modulus=c1.mod();

        System.out.println(Addition);
        System.out.println(Subtraction);
        System.out.println(Multiplication);
        System.out.println(Division);
        System.out.println(Modulus);

        scn.close();
    }
    
}
