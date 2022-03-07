package DSA;

public class LinkedList1 {
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(0);
        list.display();
        list.reverseIterate();    //iterative method of reversing a linked list
        list.display();
        list.head = list.reverseRecursive(list.head);   //recursive method of reversing a linked lis
        list.display();

    }
}

class LL1{
    Node head;
    Node tail;
    private int size;

    public LL1(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            //update prev,curr
            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}