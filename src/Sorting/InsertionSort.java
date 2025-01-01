package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
    int[] arr = {4,1,7,2,11};
    insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.err.println("i value ------   "+i);
            System.out.println("arr i "+Arrays.toString(arr));
            for (int j = i+1; j > 0 ; j--) {
                System.err.println("j value    "+j);
                System.out.println("arr j "+Arrays.toString(arr));
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    //LHS will already be sorted.
                    break;
                }
            }
        }
    }




    static void swap(int[] arr,int firstIndex,int lastIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
