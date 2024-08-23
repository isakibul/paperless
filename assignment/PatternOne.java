public class PatternOne {
    
  public static void main(String[] args) {
    int rows = 3;
    /*
     * outer loop for each row
     */
    for (int i = 1; i <= rows; ++i) {
        /*
         * inner loop to print stars in each row
         */
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      /*
       *  move to the next line after printing stars for the current row
       */
      System.out.println();
    }
  }
}