import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * prompt the user to enter a number
         */
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        /*
         * close the scanner
         */
        scanner.close();

        /*
         * check if the number is prime and display the result
         */
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        /*
         * numbers less than or equal to 1 are not prime
         */
        if (number <= 1) {
            return false;
        }

        /*
         * check divisibility from 2 up to the square root of the number
         */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
