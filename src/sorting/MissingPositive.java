package sorting;

public class MissingPositive {

    static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length){
            //since we are starting from o correct index and value would be same
            int value = arr[i]-1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[value]){
                swap(arr,i,value);
            }else {
                i++;
            }
        }
        //search for missing number
        for (int j = 0; j <arr.length; j++) {
            if (arr[j] != j+1){
                return j+1;
            }
        }
        //second case: n is not there
        return arr.length + 1;
    }




    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
