package Coding;

import java.util.*;

public class Facebook2 {

    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(0);
        numbers.add(3);
        numbers.add(1);
        numbers.add(1);

        System.out.println(countDuplicate(numbers));
    }

    public static int countDuplicate(List<Integer> numbers) {

        int count = 0;
        List<Integer> totalCount = new ArrayList<>();
        int frequency = 0;

        numbers.sort(Comparator.comparing(Integer::valueOf));

        for(int i = 0; i < numbers.size()-1; i++){
            if (numbers.get(i) == numbers.get(i+1)) {
                totalCount.add(numbers.get(i));
                frequency = Collections.frequency(totalCount, numbers.get(i));
                if (frequency == 1) {
                    count++;
                }
            }
        }

        return count;

    }

    public static int count(List<Integer> numbers){

        HashSet<Integer> setNumbers = new HashSet<Integer>();
        HashSet<Integer> duplicate = new HashSet<Integer>();

        for(int i=0;i<numbers.size();i++){
            if(setNumbers.contains(numbers.get(i))){
                duplicate.add(numbers.get(i));
            }else{
                setNumbers.add(numbers.get(i));
            }
        }

        return duplicate.size();

    }

}
