package HackerRank.LinkedList;

public class DoubleNode {

    public int data;
    public DoubleNode next;
    public DoubleNode prev;

    public DoubleNode (int data, DoubleNode  next, DoubleNode prev){

        this.data = data;
        this.next = next;
        this.prev = prev;

    }

    public DoubleNode (int data){

        this.data = data;

    }
}
