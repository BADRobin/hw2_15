package hw2_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        list();
    }
    private static void list (){
//        String s = "number_";
        List<String> list = new ArrayList<>();
        for  (int i = 0; i <= 10; i++  ) {
//            list.add( s + i);
            list.add( "number_" + i);

        }
        list.forEach(System.out::println);

    }
}
