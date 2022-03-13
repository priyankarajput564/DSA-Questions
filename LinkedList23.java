package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL23 list = new LL23();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.printList(list.head);

        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Number of triplet whose sum is equal to x : " + list.countTriplets(list.head,x));

    }
}

class LL23{
    Node head;
    Node tail;
    private int size;

    public LL23(){
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



    // function to count pairs whose sum equal to given 'value'
    public int countPairs(Node first, Node second, int value)
    {
        int count = 0;

        // The loop terminates when either of two pointers
        // become null, or they cross each other (second.next
        // == first), or they become same (first == second)
        while (first != null && second != null &&
                first != second && second.next != first) {

            // pair found
            if ((first.value + second.value) == value) {

                // increment count
                count++;

                // move first in forward direction
                first = first.next;

                // move second in backward direction
                second = second.prev;
            }

            // if sum is greater than 'value'
            // move second in backward direction
            else if ((first.value + second.value) > value)
                second = second.prev;

                // else move first in forward direction
            else
                first = first.next;
        }

        // required count of pairs
        return count;
    }

    // function to count triplets in a sorted doubly linked list
// whose sum is equal to a given value 'x'
    public int countTriplets(Node head, int x)
    {
        // if list is empty
        if (head == null)
            return 0;

        Node current, first, last;
        int count = 0;

        // get pointer to the last node of
        // the doubly linked list
        last = head;
        while (last.next != null)
            last = last.next;

        // traversing the doubly linked list
        for (current = head; current != null; current = current.next) {

            // for each current node
            first = current.next;

            // count pairs with sum(x - current.value) in the range
            // first to last and add it to the 'count' of triplets
            count += countPairs(first, last, x - current.value);
        }

        // required count of triplets
        return count;
    }
}

