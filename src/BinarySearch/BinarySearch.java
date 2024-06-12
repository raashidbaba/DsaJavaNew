package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //array is sorted in ascending order
        int[] arr = {-12,-3,1,0,3,33,43,55,433};
        int target = 33;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //better way to find mid-element to avoid range exceptions.
            int mid = start+(end-start)/2;

            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
