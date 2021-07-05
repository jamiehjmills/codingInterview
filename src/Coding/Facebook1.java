package Coding;

import java.util.LinkedList;
import java.util.List;

public class Facebook1 {

    public static void main(String[] args){

        System.out.println(newPassword("defcc", "ab"));


    }

    public static String newPassword(String a, String b){

       List<Character> newWords = new LinkedList<>();

        int index = 0;
        String password ="";
        int j = 0; // counting b
        int z = 0; // count a

        for (int i = 0; i < a.length()+b.length(); i++){

            if (z < a.length()) {
                newWords.add(index, a.charAt(i));
                index++;
                z++;
            }

            if (j < b.length()) {
                newWords.add(index, b.charAt(i));
                index++;
                j++;

            }
        }

        for(char word : newWords){

            password += word;
        }


        return password;

    }

}
