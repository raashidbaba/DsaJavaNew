package binarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[]letters = {'c','d','f','j'};
        char target = 'f';
        char sol = smallestLetter(letters,target);
        System.out.println(sol);

    }

    static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            //better way to find mid-element to avoid range exceptions.
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }
}
