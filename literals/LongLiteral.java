public class LongLiteral{
    public static void main(String[] args){
        long l=125; //assigned integer literal to long 

        // long l0=999999999999; //this will give an error (LongLiteral.java:5: error: integer number too large)

        long l1=999999999999l;

        // int i=125l; //this will give an error(LongLiteral.java:9: error: incompatible types: possible lossy conversion from long to int) because long type of literal cannot be assigned to integer type becaue long is larger and int is smaller.
        
        System.out.println(l);
        // System.out.println(l0);
        System.out.println(l1);
        // System.out.println(i);
    }
}