class Calculator {

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add (int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
}


public class Calculatorr{
    public static void main(String[] args) {
        
        Calculator cal=new Calculator();

        int r1=cal.add(2,3);
        int r2=cal.add(4,5,6);
        double r3=cal.add(5.5, 7.6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}