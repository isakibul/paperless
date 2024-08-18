public class PatternTwo {

    public static void main(String[] args) {
        int rows = 3;

        /*
         * outer loop for each row
         */
        for (int i = 1; i <= rows; ++i) {
            /*
             * inner loop to print leading spaces
             */
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }

            /*
             * inner loop to print stars
             */
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            /*
             * move to the next line after printing each row
             */
            System.out.println();
        }
    }
}
