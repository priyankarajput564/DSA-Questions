package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL5 list = new LL5();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(0);
        list.display();
        System.out.println("Enter value of x :");
        int x = sc.nextInt();
        list.makeLoop(list.head,list.tail,x);

        LL5.Node res = list.firstNodeOfLoop(list.head);

        if(res == null){
            System.out.println("List don't contain loop");
        }
        else{
            System.out.println("First node of loop is : " + res.value);
        }


    }
}

class LL5{
    Node head;
    Node tail;
    private int size;

    public LL5(){
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
        if(x == 0){
            return;
        }

        Node curr = head;
        for(int i=0;i<x;i++){
            curr = curr.next;
        }
        tail.next = curr;
    }

    public static Node detectLoop(Node head){
        Node a = head, b = head;

        while (b != null && b.next != null)
            if ((a = a.next) == (b = b.next.next))
                return a;

        return null;
    }

    //Function to remove a loop in the linked list.
    public Node firstNodeOfLoop(Node head){
        Node meet = detectLoop(head);
        if(meet == null){
            return null;
        }
        Node start = head;
        while(start != meet){
            start = start.next;
            meet = meet.next;

        }
        return start;
    }
}

