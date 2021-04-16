package COSC250;

import java.util.*;

import static java.lang.Math.abs;

public class Challenge1 {

    public static void main(String[] args){

        int[] test = {0,1,2,4,3,5};
        System.out.println(flatlandSpaceStations(6, test));

    }

    public static int flatlandSpaceStations(int n, int[] c) {

        Arrays.sort(c);
        //List<Integer> temp = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        int i = 0;
        int min = 0;

        while(i < n){

            for(int j = 0; j < c.length; j++){

                if(j == 0 ) min = (abs(c[j]-i));

                if ( min > (abs(c[j]-i))){

                    min = min = (abs(c[j]-i));
                }

            }
            finalList.add(min);
            //temp.clear();
            i++;
            //System.out.println(temp);
           // System.out.println(finalList);

        }

        return Collections.max(finalList);

    }

}
