package Basics;

public class Palindrome {
    public static void main(String[] args) {
//        String str = "abccba";
        System.out.println(palindrome(1212));
    }

    static boolean palindrome(int n){
        int copyOfN = n;
        int revNumb = 0;
        while (n>0){
            int lastDigit = n % 10;
            revNumb = (revNumb*10)+lastDigit;
            n = n/10;

        }

         if(copyOfN==revNumb){
           return true;
        }else {
             return false;
         }
    }
}
