package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL27 list = new LL27();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(0);
        list.display();

        System.out.println("Sorted LinkedList :");
        list.head = list.segregate(list.head);
        list.printList(list.head);

    }
}

class LL27{
    Node head;
    Node tail;
    private int size;

    public LL27(){
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

    public void printList(Node head){
        if(head == null){
            return;
        }
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

    //Function to sort a linked list of 0s, 1s and 2s.
    public Node segregate(Node head)
    {
        Node temp = head;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        while(temp != null){
            if(temp.value == 0){
                count0++;
            }
            else if(temp.value == 1){
                count1++;
            }
            else{
                count2++;
            }
            temp = temp.next;
        }

        Node curr = head;
        while(count0-- > 0){
            curr.value = 0;
            curr = curr.next;
        }
        while(count1-- > 0){
            curr.value = 1;
            curr = curr.next;
        }
        while(count2-- > 0){
            curr.value = 2;
            curr = curr.next;
        }

        return head;
    }
}

