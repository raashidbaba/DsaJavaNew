package LinearSearch;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] numbs = {12,3,43,55,22,1,44};
        int target = 143;
        int ans = linearSearch(numbs,target);
        System.out.println(ans);
    }

    static int linearSearch(int[]arr, int target){
        if (arr.length==0){
            return -1;
        }

        for(int index=0;index < arr.length;index++){
            int element = arr[index];
            if (element==target){
                return index;
            }


        }
        return -1;
    }



}
