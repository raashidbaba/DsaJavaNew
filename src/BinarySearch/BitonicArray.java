package BinarySearch;

public class BitonicArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,3,2,1};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int[]arr,int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticSearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        //search in second half
        return orderAgnosticSearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndex(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start>end){
            int mid  = start + (end - start) / 2;
            if (arr[mid]> arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }


    static int orderAgnosticSearch(int[]arr,int target,int start,int end){

        boolean ascSort = arr[start]<arr[end];
        while (start <= end){
            //better way to find mid-element to avoid range exceptions.
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (ascSort){
                if (target>arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }

            }else {

                if (target>arr[mid]){
                    start = mid-1;
                } else  {
                    end = mid+1;
                }
            }


        }

        return -1;
    }

}
