package HackerRank.LinkedList;

public class SinglyLinkedList {

    int data;
    Node head;
    Node tail;

    public SinglyLinkedList(int data){

        Node newNode = new Node(data);
        head = newNode;

        if(tail == null){

            tail = head;

        }

    }

    public void addToHead(int data){

        Node newNode = new Node(data, head);

        head = newNode;

    }

    public void addToTail(int data){

        Node newNode = new Node(data);

        tail.next = newNode;
        tail = newNode;

    }

    public void deleteFromHead(){

        Node newHead = head.next;

        if (newHead != null) {
            head = newHead;
        } else{
            head = tail = newHead = null;
        }

    }


    public void deleteFromTail(){

        if (head == tail){

            head = tail = null;

        }else {

            Node newTail = head;

            while (newTail.next != tail) {

                newTail = newTail.next;

            }

            tail = null;

            tail = newTail;

        }

    }

    public void printList(){

        String output = "<head> ";
        Node newTail = head;

        while(newTail != tail){

            output += newTail.data + " ";
            newTail = newTail.next;

        }

        output += tail.data + " ";
        output += "<tail>";


        System.out.println(output);


    }



}

