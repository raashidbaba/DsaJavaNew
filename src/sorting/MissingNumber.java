package sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
       ;
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            //since we are starting from o correct index and value would be same
            int value = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[value]){
                swap(arr,i,value);
            }else {
                i++;
            }
        }
        //search for missing number
        for (int j = 0; j <arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        //second case: n is not there
        return arr.length;
    }




    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
