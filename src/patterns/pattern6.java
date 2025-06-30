package patterns;

public class pattern6 {
    public static void main(String[] args) {
        p6(5);
    }

    static void p6(int n){
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++)  {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
