package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL16 list = new LL16();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(0);
        list.display();
        list.makeLoop(list.head,list.tail,1);
        System.out.println(list.isCircular(list.head));


    }
}

class LL16{
    Node head;
    Node tail;
    private int size;

    public LL16(){
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
}

