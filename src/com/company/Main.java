package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello this is only a test");

        int[] array = new int[3];
        System.out.println(funChallenge(array));
    }


    public static int funChallenge(int[] input){
        int a = 10;
        a = 50 + 3;

        for (int i = 0; i < input.length; i++){
            a++;
            System.out.println(a);
        }
        return a;
    }


}
