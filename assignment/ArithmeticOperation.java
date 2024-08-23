import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * prompt user to input two integers
         */
        System.out.print("Please enter the first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int numTwo = scanner.nextInt();

        /*
         * closing the scanner
         */
        scanner.close();

        /*
         * performing arithmetic operations
         */
        int addition = numOne + numTwo;
        int subtraction = numOne - numTwo;
        int multiplication = numOne * numTwo;
        int division = 0;
        int modulus = 0;

        /*
         * avoid division/modulus by zero
         */
        if (numTwo != 0) {
            division = numOne / numTwo;
            modulus = numOne % numTwo;
        } else {
            System.out.println("Division and modulus by zero are not allowed.");
        }

        /*
         * printing results of the arithmetic operations
         */
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
}
