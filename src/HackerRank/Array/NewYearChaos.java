package HackerRank.Array;

public class NewYearChaos {

    //Hackerrank question on Arrays in Interview Preparation Kit
    //https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

    public static void main(String[] args){

        int[] arr = {2,5,1,3,4};
        minimumBribes(arr);

    }
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int totalBribe = 0;
        int fromPerson = 0;
        Boolean bribeFromPerson = false;

        if (!bribeFromPerson){

            // 2 5 1 3 4
            for(int i = 0; i < q.length-1; i++){
                //5 > 1 when i = 2
                if(q[i] > q[i+1]){
                                 // 4 - 2 -> fromPerson = 2
                    fromPerson = (q[i]-1) - i;
                    totalBribe += fromPerson; // totalBribe = 3

                }

                if(fromPerson > 2) bribeFromPerson = true;

                fromPerson = 0;

            }

        }

        if(bribeFromPerson){
            System.out.println("Too chaotic");
            //System.out.println(totalBribe);
        }else {
            System.out.println(totalBribe);
        }

    }

}
