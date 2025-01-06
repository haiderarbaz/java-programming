public class DecimalLiteral{
    public static void main(String[] args){
        // float f=12.56; //this will give an error (DecimalLiteral.java:3: error: incompatible types: possible lossy conversion from double to float) becuse by default any number in decimal form is default and double is larger and float is smaller for making it float we have to write f at the end like this "12.56f"

        float f=12.56f;

        double d=12.56;

        System.out.println(f);
        System.out.println(d);
    }
}