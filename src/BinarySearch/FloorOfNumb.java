package BinarySearch;

public class FloorOfNumb {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 14, 16, 18};
        int target = 0;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //return the index of greatest numb <= target
    static int floor(int[] arr, int target) {
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

        return end;
    }
}
