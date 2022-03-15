package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL24 list = new LL24();
        list.insertFirst(1);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(11);
        list.insertFirst(23);
        System.out.println("Original Doubly linked list:");
        list.printList(list.head);

        System.out.println("Enter value of k : ");
        int k = sc.nextInt();
        list.head = list.sortAKSortedDLL(list.head,k);
        System.out.println("Doubly Linked List after sorting:");
        list.printList(list.head);

    }
}

class LL24{
    Node head;
    Node tail;
    private int size;

    public LL24(){
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

    // function to sort a k sorted doubly linked list
// Using Insertion Sort
// Time Complexity: O(n*k)
// Space Complexity: O(1)
    public Node sortAKSortedDLL( Node head, int k) {
        if(head == null || head.next == null)
            return head;

        // perform on all the nodes in list
        for(Node i = head.next; i != null; i = i.next) {
            Node j = i;
            // There will be atmost k swaps for each element in the list
            // since each node is k steps away from its correct position
            while(j.prev != null && j.value < j.prev.value) {
                // swap j and j.prev node
                Node temp = j.prev.prev;
                Node temp2 = j.prev;
                Node temp3 = j.next;
                j.prev.next = temp3;
                j.prev.prev = j;
                j.prev = temp;
                j.next = temp2;
                if(temp != null)
                    temp.next = j;
                if(temp3 != null)
                    temp3.prev = temp2;
            }
            // if j is now the new head
            // then reset head
            if(j.prev == null)
                head = j;
        }
        return head;
    }

    //Second method to sort using priority queue
    /*
    Node sortAKSortedDLL( Node head, int k)
    {

        // if list is empty
        if (head == null)
            return head;

        // priority_queue 'pq' implemented as min heap with the
        // help of 'compare' function in compare Node class
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode());

        Node newHead = null, last = null;

        // Create a Min Heap of first (k+1) elements from
        // input doubly linked list
        for (int i = 0; head != null && i <= k; i++)
        {

            // push the node on to 'pq'
            pq.add(head);

            // move to the next node
            head = head.next;
        }

        // loop till there are elements in 'pq'
        while (!pq.isEmpty())
        {

            // place root or top of 'pq' at the end of the
            // result sorted list so far having the first node
            // pointed to by 'newHead'
            // and adjust the required links
            if (newHead == null)
            {
                newHead = pq.peek();
                newHead.prev = null;

                // 'last' points to the last node
                // of the result sorted list so far
                last = newHead;
            }

            else
            {
                last.next = pq.peek();
                pq.peek().prev = last;
                last = pq.peek();
            }

            // remove element from 'pq'
            pq.poll();

            // if there are more nodes left in the input list
            if (head != null)
            {

                // push the node on to 'pq'
                pq.add(head);

                // move to the next node
                head = head.next;
            }
        }

        // making 'next' of last node point to NULL
        last.next = null;

        // new head of the required sorted DLL
        return newHead;
    }
    */
}

