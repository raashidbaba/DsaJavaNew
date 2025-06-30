package linearSearch;

public class MaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,33,4,5,6},
                {43,5,55},
                {76,23}

        };
        System.out.println(max(arr));
    }

    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
