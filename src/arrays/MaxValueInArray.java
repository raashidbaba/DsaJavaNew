package arrays;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,66};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxAssume = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>maxAssume){
                maxAssume = arr[i];
            }
        }
        return maxAssume;

    }
}
