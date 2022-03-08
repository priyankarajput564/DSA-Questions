package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL8 list = new LL8();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(2);
        list.insertFirst(9);
        list.display();

        list.moveToFront();
        list.display();

    }
}

class LL8{
    Node head;
    Node tail;
    private int size;

    public LL8(){
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

    public void moveToFront()
    {
        /* If linked list is empty or it contains only one node then simply return. */
        if(head == null || head.next == null)
            return;

        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;

        while (last.next != null)
        {
            secLast = last;
            last = last.next;
        }

        secLast.next = null;
        last.next = head;
        head = last;
    }
}

