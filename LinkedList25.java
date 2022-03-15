package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL25 list = new LL25();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.printList(list.head);

        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        list.head = list.update(list.head,n);
        System.out.println("Doubly LinkedList after rotation by n  : ");
        list.printList(list.head);

    }
}

class LL25{
    Node head;
    Node tail;
    private int size;

    public LL25(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void printList(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class Node{
        int value;
        Node next,prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node update(Node head, int p) {
        //Write your code here
        if(p==0)
            return head;
        Node temp=head;
        int c=0;

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=head;
        head.prev=temp;

        temp=head;

        while(c<p)
        {
            temp=temp.next;
            c++;
        }

        temp.prev.next=null;
        temp.prev=null;
        return temp;
    }
}

