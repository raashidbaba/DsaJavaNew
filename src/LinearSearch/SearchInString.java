package LinearSearch;

import java.util.Arrays;

public class SearchInString {
    
    //Q.search in a string
    public static void main(String[] args) {
        String str = "hello";
        char target = 'l';
       Boolean ans =  search(str,target);
        System.out.println(ans);


       // System.out.println(Arrays.toString(str.toCharArray()));

    }

    static boolean search(String str,char target){
        if (str.length()==0){
            return false;
        }

        //to use for-each
        for (char ch:str.toCharArray()) {
            if (ch==target){
                return true;
            }
            
        }
        
        
       /* for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }

        }*/
        return false;
    }
}
