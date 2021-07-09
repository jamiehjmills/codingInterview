package CrackingCodingInterview.LinkedList;


import HackerRank.LinkedList.Node;
import HackerRank.LinkedList.SinglyLinkedList;

import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        SinglyLinkedList unorderdList = new SinglyLinkedList(1);
        unorderdList.addToHead(1);
        unorderdList.addToHead(1);
        unorderdList.addToHead(2);
        unorderdList.addToHead(3);
        unorderdList.addToHead(3);
        unorderdList.addToHead(4);
        unorderdList.addToHead(5);

        removeDups(unorderdList.getHead());
        //deleteDups(unorderdList.getHead());

        unorderdList.printList();
        returnKthToLast(unorderdList.getHead(), 3);

    }

    // Cracking the coding interview (Q1 in pg. 94) - that's what I did
    public static void removeDups(Node n){

        HashSet<Integer> checkingDups = new HashSet<>();

        while(n != null){

            if(!checkingDups.contains(n.data)){

                checkingDups.add(n.data); // 1,2,3,4,5

            }

            n = n.next;
        }

        System.out.println(checkingDups);
        System.out.println("hi");

    }

    //Cracking the coding interview (Q1 in pg. 94) - that's a solution

    public static void deleteDups(Node n){

        HashSet<Integer> set = new HashSet<Integer>();
        Node previous = null;
        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }else{
                set.add(n.data);
                previous = n;
            }
            n = n.next;

        }

        //System.out.println(set);


    }

    // 5,4,3,3,2,1,1,1 -> k = 3 (3rd element in the list)

    // Cracking the coding interview (Q2 in pg. 94)
    public static void returnKthToLast(Node n, int k){

        int i = 1; // this is a head
        String printOut = "<head> ";

        while(i != k){

            n = n.next;
            i++;

        }

        while(n != null){

            printOut += n.data + " ";
            n = n.next;

        }

        printOut += " <tail>";

        System.out.println(printOut);

    }

}
