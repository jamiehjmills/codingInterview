package Coding;

import java.util.HashSet;

public class SortingAlphabetical {


    public static void main(String[] args) {

        String[] names = {"abc", "acb", "addddd", "atu"};

        int[] arr = {1,2,3,4};

        System.out.println(pairs(1, arr));

    }

    public static String[] sortedArray(String[] list){

        int j = 0;
        int temp = 0;
        for(int i = 0; i < list.length-1; i++){


            while(list[j])
            if (list[i].charAt(j) > list[i].charAt(j+1))

                j++

        }

    }

    public static int pairs(int k, int[] arr)
    {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }

        System.out.println(set);

        for(int number : arr)
        {
            if(set.contains(number + k))
            {
                count++;
            }
        }
        return count;
    }


}
