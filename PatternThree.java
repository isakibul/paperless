public class PatternThree {

    public static void main(String[] args) {
        int rows = 3;

        /*
         * print the upward pyramid
         */
        for (int i = 1; i <= rows; ++i) {
            /*
             * print leading spaces
             */
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            /*
             * print stars
             */
            for (int j = 1; j <= (2 * i - 1); ++j) {
                System.out.print("*");
            }
            /*
             * move to the next line
             */
            System.out.println();
        }

        /*
         * print the downward pyramid
         */
        for (int i = rows - 1; i >= 1; --i) {
            /*
             * print leading spaces
             */
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            /*
             * print stars
             */
            for (int j = 1; j <= (2 * i - 1); ++j) {
                System.out.print("*");
            }
            /*
             * move to the next line
             */
            System.out.println();
        }
    }
}
