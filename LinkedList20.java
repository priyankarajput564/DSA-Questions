package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL20 list = new LL20();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.printList(list.head);
        System.out.println("Enter any value you want to delete from linkedlist :");
        int d = sc.nextInt();

        list.deleteNode(list.head,d);
        list.printList(list.head);


    }
}

class LL20{
    Node head;
    Node tail;
    private int size;

    public LL20(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
        size += 1;
    }

    public void printList(Node head){
        Node temp = head;
        if(head != null) {
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
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

    public Node deleteNode(Node head,int d)
    {
        if (head == null)
            return null;

        // Find the required node
        Node curr = head, prev = null;
        while (curr.value != d) {
            if (curr.next == head) {
                break;
            }

            prev = curr;
            curr = curr.next;
        }

        // Check if node is only node
        if (curr == head && curr.next == head) {
            head = null;
            return head;
        }

        // If more than one node, check if
        // it is first node
        if (curr == head) {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = curr.next;
            prev.next = head;
        }

        // check if node is last node
        else if (curr.next == head) {
            prev.next = head;
        }
        else {
            prev.next = curr.next;
        }
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public Node reverse(Node head)
    {
        //Add your code here
        Node curr=head,prev=null;
        do{
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }while(curr!=head);
        head.next = prev;
        return prev;
    }
}

