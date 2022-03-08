package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL6 list = new LL6();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(4);
        list.insertLast(0);
        list.display();

        list.head = list.removeDuplicates(list.head);
        list.display();

    }
}

class LL6{
    Node head;
    Node tail;
    private int size;

    public LL6(){
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

    public Node removeDuplicates(Node head)
    {
        if(head==null || head.next==null)
            return head;
        Node temp = head.next;
        Node curr = head;
        while(temp!=null)
        {
            if(curr.value==temp.value){
                curr.next=temp.next;
                temp.next=null;
                temp=curr.next;
            }
            else{
                curr = temp;
                temp= temp.next;
            }
        }
        return head;
    }
}

