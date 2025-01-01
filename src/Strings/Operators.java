package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'c');
        System.out.println("a"+"c");
        System.out.println('a'+3);
        System.out.println((char) ('a'+3));



        //when integer is concatenated with a character
        //integer will be converted to Integer and will call .toString()
        //this is same after few steps as: "q" + "3"
        System.out.println("a"+3);




        //arraylist will call .toString()
        System.out.println("a"+ new ArrayList<>());

        //this wont work
        //cause + operator in java is only defined for primitives
        //or one of the parameter should be string
//        System.out.println(new Integer(46)+ new ArrayList<>());


        //this will work
        //string param is added in bw
        //entire result will be of type string
        System.out.println(new Integer(46)+" "+ new ArrayList<>());





    }
}
