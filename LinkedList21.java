package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL21 list = new LL21();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.printList(list.head);
        list.head = list.reverseDLL(list.head);
        list.printList(list.head);

    }
}

class LL21{
    Node head;
    Node tail;
    private int size;

    public LL21(){
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

    public Node reverseDLL(Node  head)
    {
        if(head==null || head.next==null){
            return head;
        }

        Node prev= null;
        Node curr=head;
        while (curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
}

