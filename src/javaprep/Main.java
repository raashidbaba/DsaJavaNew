package javaprep;


import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args){

        try{
            File file = new File("sample.txt");

            if(file.createNewFile()){
                System.out.println("file created");
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            e.printStackTrace();
        }





    }


}