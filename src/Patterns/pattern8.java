package Patterns;

public class pattern8 {
    public static void main(String[] args) {
p8(5);
    }

    static void p8(int n){
        for (int i = 0; i < 2*n-1; i++) {

            if (i>n){
                for (int j = 0; j < 2*n-i; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
