package HackerRank.LinkedList;

public class Main{


    public static void main(String args[]){


        DoublyLinkedList example = new DoublyLinkedList (1);
        example.addToHead(2);
        example.addToHead(3);
        example.addToHead(4);
        example.addToHead(5);

        example.printList();

        example.addToTail(0);
        example.addToTail(10);
        example.addToTail(20);

        example.printList();

        example.deleteFromHead();
        example.deleteFromHead();
        example.deleteFromHead();

        example.printList();

        example.deleteFromTail();
        example.deleteFromTail();
        example.deleteFromTail();

        example.printList();

        example.deleteFromTail();

        example.printList();
    }


}