package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        p7(5);
    }

    static void p7(int n){
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*n-(2*i+1 ); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
