package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {2,11,6,4,1};
//        int[] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void cyclic(int[] arr){
        int i = 0;
      while (i < arr.length){
          //value of that index

//          System.out.println("arr crr"+correct);
            if (arr[i] < arr.length && arr[i] != arr[i]-1){
                int correct = arr[i]-1;
                System.out.println("values arr"+arr[i] );
                System.out.println("values corr"+arr[correct]);
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    
    

    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
