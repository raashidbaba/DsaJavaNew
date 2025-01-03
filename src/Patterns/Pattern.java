package Patterns;

public class Pattern {
    public static void main(String[] args) {
//        p1(10);
//        p2(3);
        p3(5);

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
}
