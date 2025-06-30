package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        //find the maximum item in the remaining array and swipe with correct index.
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);

        }

    }


    //this will give the max index.
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
        if (arr[max]<arr[i]){
            max = i;
        }
        }
        return max;

    }


    private static void swap(int[]arr,int maxIndex,int lastIndex){
        int temp = arr[maxIndex];//5
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;

    }
}
