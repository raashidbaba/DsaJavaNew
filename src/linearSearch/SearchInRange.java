package linearSearch;

public class SearchInRange {

    //Q.search in range?
    public static void main(String[] args) {
        int[] arr = {1,9,12,3,-4,15};
        int target = -4;
        int ans = search(arr,target,1,4);
        System.out.println(ans);

    }

    static int search(int[]arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }

        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if (element==i){
                return i;
            }

        }
        return -1;
    }
}
