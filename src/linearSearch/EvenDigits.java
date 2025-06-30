package linearSearch;

public class EvenDigits {
    public static void main(String[] args) {

    }

    static int maxWealth(int[][]accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int personsAcc = 0; personsAcc < accounts[personsAcc].length; personsAcc++) {
                sum +=accounts[person][personsAcc];
            }
            //check with overall ans
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
