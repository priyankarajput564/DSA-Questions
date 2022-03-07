package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL2 list = new LL2();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(0);
        list.display();
        System.out.println("Enter value of k :");
        int k = sc.nextInt();
        LL2.Node res = list.reverse(list.head,k);
        list.printList(res);
    }
}

class LL2{
    Node head;
    Node tail;
    private int size;

    public LL2(){
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

    public static Node reverse(Node node, int k) {
        if(node==null || node.next==null) return node;
        return reverseList(node, node, k, k, null);
    }

    public static Node reverseList(Node head, Node current, int k, int runningK, Node previous){
        if(current==null) {
            return previous;
        }
        if(runningK==0) {
            runningK = k;
            head.next = reverseList(current, current, k, k, null);
            return previous;
        }
       Node next = current.next;
        current.next = previous;
        previous = current;
        current = next;
        return reverseList(head, current, k, runningK-1, previous);
    }

    public void printList(Node node){
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

}

