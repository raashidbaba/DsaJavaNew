package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 523.2325f;

        //this will print only two digits after decimal
        //here we use printf instead of println
        //% this is a place holder
        System.out.printf("print only %.2f", num);

        //to print pi value
        System.out.println(Math.PI);

        //to print pi till three values after decimal
        System.out.printf("print only %.3f",Math.PI);

        //print two strings
        System.out.printf("print two strings %s and %s","kunal","bob");
    }
}
