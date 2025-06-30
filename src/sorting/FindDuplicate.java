package sorting;

class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i+1){
                //since we are starting from 1 correct index and value would be same
                int value = arr[i]-1;
                if (arr[i] != arr[value]){
                    swap(arr,i,value);
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }

        }
        return  -1;
    }

    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}