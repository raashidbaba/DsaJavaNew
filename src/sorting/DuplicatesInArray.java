package sorting;

/*public class DuplicatesInArray {
    public static void main(String[] args) {

    }

    static int[] duplicatesInArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {

        }

        return arr;
    }





    static void sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i+1){
                //since we are starting from 1 correct index and value would be same
                int value = arr[i]-1;
                if (arr[i] != arr[value]){
                    swap(arr,i,value);
                }else {

                }
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
}*/


import java.util.ArrayList;
import java.util.List;

class DuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length){
            //since we are starting from o correct index and value would be same
            int value = nums[i]-1;

            if (nums[i] != nums[value]){
                swap(nums,i,value);
            }else {
                i++;
            }
        }
        //find missing number
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j <nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(nums[j]);
            }
        }
        return list;
    }

    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

}
