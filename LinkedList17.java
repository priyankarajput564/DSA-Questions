package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL17 list = new LL17();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(6);
        list.makeLoop(list.head,list.tail,1);
        list.printList(list.head);

        list.splitList(list);
        list.printList(list.head1);
        list.printList(list.head2);


    }
}

class LL17{
    Node head,head1,head2;
    Node tail;
    private int size;

    public LL17(){
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


    public void printList(Node head){
        Node temp = head;
        if(head != null) {
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("END");
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void makeLoop(Node head,Node tail,int x){
        Node curr = head;
        tail.next = curr;
    }

    boolean isCircular(Node head)
    {
        Node a = head, b = head;

        while (b != null && b.next != null)
            if ((a = a.next) == (b = b.next.next))
                return true;

        return false;
    }

    void splitList(LL17 list)
    {
        // when list contain only one element
        if(list.head.next == list.head){
            list.head1 = list.head;
            list.head2 = null;
            return;
        }

        Node slow = list.head;
        Node fast = list.head;
        while(fast.next != list.head && fast.next.next != list.head){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = slow.next;
        slow.next = list.head;
        list.head1 = list.head;
        list.head2 = temp;

        while(temp.next != list.head){
            temp = temp.next;
        }
        temp.next = list.head2;
    }
}

