package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL9 list = new LL9();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(1);
        list.insertFirst(7);
        list.display();

        list.head = list.addOne(list.head);
        list.display();
    }
}

class LL9{
    Node head;
    Node tail;
    private int size;

    public LL9(){
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

    public int add(Node head){
        if(head.next==null){
            head.value += 1;
            if(head.value>9){
                head.value = head.value%10;
                return 1;
            }
            return 0;
        }
        int carry = add(head.next);
        if(carry==1) head.value += 1;
        if(head.value>9){
            head.value = head.value%10;
            return 1;
        }
        return 0;
    }

    public Node addOne(Node head) {
        //code here.
        int carry = add(head);
        if(carry==1){
            Node temp = new Node(1);
            temp.next = head;
            head = temp;
        }
        return head;
    }
}

