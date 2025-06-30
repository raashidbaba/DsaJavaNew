package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-3,1,0,3,33,43,55,433};
        int target = 55;
        int ans = search(arr,target);
        System.out.println(ans);


    }



    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
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
