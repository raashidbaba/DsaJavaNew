package patterns;

public class Pattern {
    public static void main(String[] args) {
//        p1(10);
//        p2(3);
//        p3(5);
//         p4(5);
//        p5(5);
        p6          (5);
    }
  /*  static void p1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run th col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //when one row is printed,we need to add new line
            System.out.println();
        }
    }*/



  /*  static void p2(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run th col
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("*");
            }
            //when one row is printed,we need to add new line
            System.out.println();
        }
    }*/


    static void p3(int n){
        for (int row = 1; row < 2 * n; row++) {

            //here if row is > n then col = 2*n - row
            //else = row only.
            int totalCols = row > n ? 2*n - row : row;


            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            //when one row is printed,we need to add new line
            System.out.println();
        }
    }

    static void p4(int n){
        for (int row = 0; row < 2 * n; row++) {

            //here if row is > n then col = 2*n - row
            //else = row only.
            int totalCols = row > n ? 2*n - row : row;

            //no of spaces
            int totalNoOfSpaces = n - totalCols;
            for (int sp = 0; sp < totalNoOfSpaces; sp++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            //when one row is printed,we need to add new line
            System.out.println();
        }
    }

    static void p5(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.println(" ");
            }
            for (int col = row; col >=1; col--) {
                System.out.println(col);
            }
            for (int col = 2; col <= row ; col++) {
                System.out.println(col);
            }
            System.out.println();
        }

    }




    public static void p6(int n){

        for (int row = 0; row < 2*n-1; row++) {
            for (int col = 0; col <  2*n-1; col++) {
                int atEveryIndex = 4567;
                System.out.println(atEveryIndex);
            }
            System.out.println();
        }
    }
}


