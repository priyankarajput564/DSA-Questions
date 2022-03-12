package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL18 list = new LL18();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();

        System.out.println("Given linked list is palindrome :" + list.isPalindrome(list.head));
    }
}

class LL18{
    Node head;
    Node tail;
    private int size;

    public LL18(){
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

    boolean isPalindrome(Node head)
    {
        //Your code here
        Node mid = findMid(head);
        Node head2 = reverse(mid);
        while(head2 != null){
            if(head.value != head2.value){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }

    Node reverse(Node mid){
        Node prev = null;
        Node curr = mid;
        Node temp = null;
        while(curr != null ){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    Node findMid(Node head){
        Node fast=head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

