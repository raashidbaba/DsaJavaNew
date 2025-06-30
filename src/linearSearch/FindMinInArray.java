package linearSearch;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {1,9,12,3,-4,15};
       int answer = search(arr);
        System.out.println(answer);

    }

    static int search(int[]arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
