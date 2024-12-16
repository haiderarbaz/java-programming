import java.util.Scanner;

class Addition{
    
    static int a;
    static int b;

    public static void add(){
        int res=a+b;
        System.out.println("Addition of a & b is: "+res);
    }

    public static void main(String[] args)
    {   

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = scn.nextInt();
        System.out.print("Enter the value of b: ");
        b = scn.nextInt();

        add();

        scn.close();
    }
}
