import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * prompt the user to enter a year
         */
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        /*
         * close the scanner
         */
        scanner.close();

        /*
         * check if the year is a leap year and display the result
         */
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        /*
         * check leap year conditions
         */
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
