package BinarySearch;

public class CeilingOfNumb {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 14, 16, 18};
        int target = 19;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index of smallest numb >= target
    static int ceiling(int[] arr, int target) {
        //but what if target is greatest number than the greatest element in the array.
        if (target> arr.length-1){
            return -1;
        }


        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //better way to find mid-element to avoid range exceptions.
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
