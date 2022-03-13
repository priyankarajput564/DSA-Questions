package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL22 list = new LL22();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.printList(list.head);
        System.out.println("Enter any number: ");
        int x = sc.nextInt();
        list.pairSum(list.head,x);

    }
}

class LL22{
    Node head;
    Node tail;
    private int size;

    public LL22(){
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

    public void pairSum( Node head, int x)
    {
        // Set two pointers, first to the beginning of DLL and second to the end of DLL.
        Node first = head;
        Node second = head;
        while (second.next != null)
            second = second.next;

        // To track if we find a pair or not
        boolean found = false;

        while ( first != second && second.next != first)
        {
            // pair found
            if ((first.value + second.value) == x)
            {
                found = true;
                System.out.println( "(" + first.value +
                        ", "+ second.value + ")" );

                // move first in forward direction
                first = first.next;

                // move second in backward direction
                second = second.prev;
            }
            else
            {
                if ((first.value + second.value) < x)
                    first = first.next;
                else
                    second = second.prev;
            }
        }

        // if pair is not present
        if (found == false)
            System.out.println("No pair found");
    }

}

