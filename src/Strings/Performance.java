package Strings;

public class Performance {
  /*  public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch );
            series = series+ch;

        }
        System.out.println(series);
    }*/

    public static void main(String[] args) {
        //how to reduce time complexity
        //use data type StringBuilder
        //it does not create a new obj every time
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch );
            sb.append(ch);

        }
        System.out.println(sb);
    }

}
