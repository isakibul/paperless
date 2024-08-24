public class PatternFive {
    public static void main(String[] args) {
        int n = 7;
        int max = 4;

        /*
         * loop through each row of the matrix
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = max - Math.min(
                    Math.min(i, j),
                    Math.min(n - 1 - i, n - 1 - j)
                );
                
                /*
                 * print the value followed by a space
                 */
                System.out.print(value + " ");
            }
            /*
             * move to the next line after each row is printed
             */
            System.out.println();
        }
    }
}

