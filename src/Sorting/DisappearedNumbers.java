package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
            if (nums[j] != j+1){
                list.add(j+1);
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
