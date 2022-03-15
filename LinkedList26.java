package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL26 list = new LL26();
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
        list.head = list.revListInGroupOfGivenSize(list.head,n);
        System.out.println("Reverse Doubly LinkedList by group of n  : ");
        list.printList(list.head);

    }
}

class LL26{
    Node head;
    Node tail;
    private int size;

    public LL26(){
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

    // function to insert a node at the beginning
    // of the Doubly Linked List
    static Node push(Node head, Node new_node)
    {
        // since we are adding at the beginning,
        // prev is always NULL
        new_node.prev = null;

        // link the old list off the new node
        new_node.next = head;

        // change prev of head node to new node
        if (head != null)
            head.prev = new_node;

        // move the head to point to the new node
        head = new_node;
        return head;
    }

    // function to reverse a doubly linked list
    // in groups of given size
    static Node revListInGroupOfGivenSize(Node head, int k)
    {
        Node current = head;
        Node next = null;
        Node newHead = null;
        int count = 0;

        // reversing the current group of k
        // or less than k nodes by adding
        // them at the beginning of list
        // 'newHead'
        while (current != null && count < k)
        {
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }

        // if next group exists then making the desired
        // adjustments in the link
        if (next != null)
        {
            head.next = revListInGroupOfGivenSize(next, k);
            head.next.prev = head;
        }

        // pointer to the new head of the
        // reversed group
        return newHead;
    }
}

