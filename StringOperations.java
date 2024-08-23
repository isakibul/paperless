import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * taking input of two strings
         */
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        /*
         * concatenation
         */
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        /*
         * comparison
         */
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("The strings are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is greater than the second string.");
        } else {
            System.out.println("The first string is less than the second string.");
        }

        /*
         * finding the length of each string
         */
        System.out.println("Length of the first string: " + str1.length());
        System.out.println("Length of the second string: " + str2.length());

        /*
         * converting strings to uppercase
         */
        System.out.println("First string in uppercase: " + str1.toUpperCase());
        System.out.println("Second string in uppercase: " + str2.toUpperCase());

        /*
         * checking if one string contains the other
         */
        if (str1.contains(str2)) {
            System.out.println("The first string contains the second string.");
        } else if (str2.contains(str1)) {
            System.out.println("The second string contains the first string.");
        } else {
            System.out.println("Neither string contains the other.");
        }

        scanner.close();
    }
}
