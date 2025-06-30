package patterns;

public class pattern9 {
    public static void main(String[] args) {
p9(5);
    }

    static void p9(int n){
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                start = 1;
            }else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);

                //flip
                start = 1-start;
            }

            System.out.println();
        }
    }
}
