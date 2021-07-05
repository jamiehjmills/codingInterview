package Coding;

public class Nab2 {

    public static String solution(String S) {
        //Prints the most occurred letter. If they are the same, it returns first alphabetically.

                //UPDATE: First, You used an ASCII code for the array index, and the first value in the array is equal to the frequency of letter a. Also, the 26 values in the array are the same as the frequency values of letter a through letter z. (See the "Comment 1" in the code)

        //Therefore, if the array is searched in reverse order, the output will be in alphabetical order when the frequencies are the same. (See "Comment 2)

            // Comment 1: initialize array
            int[] occurrences = new int[26];
            for (char ch : S.toCharArray()) {
                occurrences[ch - 'a']++;
            }

            char best_char = 'a';
            int  best_res  = 0;

            // Comment 2: the array is searched in reverse order
            // for (int i = 1; i < 26; i++) { // it is your code
            for (int i = occurrences.length - 1; i >= 0 ; i--) {
                if (occurrences[i] >= best_res) {
                    best_char = (char)((int)'a' + i);
                    best_res  = occurrences[i];
                }
            }

            return Character.toString(best_char);
    }

    public static void main(String[] args){

        System.out.println(solution("Hello"));

    }
}
