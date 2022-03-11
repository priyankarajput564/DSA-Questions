package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL15 list = new LL15();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertLast(6);
        list.display();

        LL15.Node res = list.middleNode(list.head);
        System.out.println("Middle element of linkedlist :" + res.value);
    }
}

class LL15{
    Node head;
    Node tail;
    private int size;

    public LL15(){
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

    public Node middleNode(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

