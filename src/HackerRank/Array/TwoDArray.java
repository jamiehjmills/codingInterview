package HackerRank.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDArray {

    public static void main(String[] args){

        String name = "0 1 3";
        System.out.println(min(name));

    }

    public static int min(String number){

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < number.length(); i++){

            list.add(Character.getNumericValue(number.charAt(i)));
        }

        list.removeIf(n -> n.equals(-1));


        return Collections.min(list);


    }

    
}
