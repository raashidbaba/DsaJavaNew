package Sorting;

public class SetMismach {
    public int[] findErrorNums(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                //since we are starting from o correct index and value would be same
                int value = arr[i]-1;
                if ( arr[i] != arr[value]) {
                    swap(arr, i, value);
                } else {
                    i++;
                }
            }
            //search for missing number
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j+1) {
                    return new int[] {arr[j],j+1};
                }
            }

            return new int[] {-1,-1};
    }

    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}