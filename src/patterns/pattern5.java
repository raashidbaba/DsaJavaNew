package patterns;

public class pattern5 {
    public static void main(String[] args) {
        p1(5);
    }

    static void p1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <n-i+1; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}
