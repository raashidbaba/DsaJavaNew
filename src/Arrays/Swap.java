package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i=0;i< arr.length;i++){
//            arr[i] = scanner.nextInt();
//          //  System.out.println(arr[i]);
//
//        }
//        System.out.println(Arrays.toString(arr));


        //array of objs
        String[] str = new String[4];
        for (int i = 0; i<str.length;i++){
            str[i] = scanner.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[2] = "bobby";
        System.out.println(Arrays.toString(str));
    }


}
