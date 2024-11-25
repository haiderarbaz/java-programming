import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer");
        int i = scan.nextInt();
		System.out.println("Enter a double");
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the leftover newline OR Consumes the newline character left by nextDouble() to prepare for reading a string
		System.out.println("Enter a string");
        String s = scan.nextLine();
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

//To avoid unexpected behavior when switching from nextInt(), nextDouble(), nextFloat(), or nextBoolean() to nextLine(), it’s generally a good practice to call scan.nextLine(); once to consume any leftover newline character. This ensures that nextLine() correctly reads the intended line of input.
//scan.nextLine();: Reads the newline character that remains in the input buffer after reading the double. This step is necessary because nextInt() and nextDouble() do not consume the newline character after the number, so calling nextLine() after them without this line would skip reading the string.