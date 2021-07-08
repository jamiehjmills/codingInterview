package HackerRank.LinkedList;

public class DoublyLinkedList {

    private int data;
    private DoubleNode head;
    private DoubleNode tail;


    public DoublyLinkedList(int data){

        DoubleNode newDoubleNode = new DoubleNode(data);
        head = newDoubleNode;
        tail = head;

    }

    public void addToHead(int data){

        DoubleNode newNode = new DoubleNode(data, head, null);

        head.prev = newNode;

        head = newNode;

    }

    public void addToTail(int data){

        DoubleNode newNode = new DoubleNode(data, null, tail);

        tail.next = newNode;

        tail = newNode;

    }

    public void deleteFromHead(){

        DoubleNode newHead = head.next;

        if (newHead != null) {
            head = newHead;
            head.prev = null;
        } else{
            head = tail = newHead = null;
        }

    }


    public void deleteFromTail(){

        if (head == tail){

            head = tail = null;

        }else {

            DoubleNode newTail = tail.prev;

            tail = null;

            tail = newTail;

        }

    }

    public void printList(){

        String output = "<head> ";
        DoubleNode newTail = head;

        while(newTail != tail){

            output += newTail.data + " ";
            newTail = newTail.next;

        }

        output += tail.data + " ";
        output += "<tail>";


        System.out.println(output);


    }




}
