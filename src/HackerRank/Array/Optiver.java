package HackerRank.Array;

import java.util.*;

public class Optiver {

    public static void main(String[] args){


    String memoir = "toward inhabit either never toward inhabit";
    List<String> words = new ArrayList<>();

    words.add("be");
    words.add("do");
    words.add("either");
    words.add("facing");
    words.add("inhabit");
    words.add("never");
    words.add("not");
    words.add("or");
    words.add("or");
    words.add("towards");

    System.out.println(Collections.frequency(words, "or"));


    List<Integer> thesaurusFrom = new ArrayList<>();

        thesaurusFrom.add(2);
        thesaurusFrom.add(3);
        thesaurusFrom.add(3);
        thesaurusFrom.add(9);
        thesaurusFrom.add(4);
        thesaurusFrom.add(4);
        thesaurusFrom.add(5);

        List<Integer> thesaurusTo = new ArrayList<>();

        thesaurusTo.add(7);
        thesaurusTo.add(9);
        thesaurusTo.add(8);
        thesaurusTo.add(3);
        thesaurusTo.add(0);
        thesaurusTo.add(1);
        thesaurusTo.add(6);


        compress(memoir,words,3,thesaurusFrom,thesaurusTo);


    }

    public static void compress(String memoir, List<String> words, int thesaurusNodes, List<Integer> thesaurusFrom, List<Integer> thesaurusTo) {

        List<String> listFrom= new ArrayList<>();
        List<String> listFromTemp = new ArrayList<>();
        List<String> listTo = new ArrayList<>();

        for(int i = 0; i< thesaurusFrom.size(); i++){
            listFrom.add(words.get(thesaurusFrom.get(i)));
            listFromTemp.add(words.get(thesaurusFrom.get(i)));
        }

        for(int i = 0; i< thesaurusTo.size(); i++){
            listFrom.add(words.get(thesaurusTo.get(i)));
        }

        String[] memoirArray = memoir.split("\\s+");

        for(int i = 0; i < memoirArray.length; i++){

            memoirArray[i] = memoirArray[i].replaceAll("[^\\w]", "");
        }


//        for(int i = 0; i < memoirArray.length; i++){
//            int n = Collections.frequency(thesaurusFrom, memoirArray[i]);
//            if(n > 1){
//                int index = listFromTemp.indexOf(memoirArray[i]);
//                listFromTemp.remove(index);
//            }
//        }

        List<Integer> index = new ArrayList<>();

        for(int j = 0; j < memoirArray.length; j++){
            for(int i = 0; i < thesaurusFrom.size(); i++) {
                // towards
                if (memoirArray[j].equals(listFrom.get(i))) {
                    index.add(i);
                }
            }

        }

        System.out.println(index);

    }
}
