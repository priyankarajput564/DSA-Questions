package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL13 list = new LL13();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertLast(6);
        list.display();

        list.head = list.mergeSort(list.head);
        list.display();
    }
}

class LL13{
    Node head;
    Node tail;
    private int size;

    public LL13(){
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

    public Node mergeList(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;
        while(l1!=null && l2!=null){
            if(l1.value<=l2.value){
                curr.next = l1;
                l1=l1.next;
            }
            else{
                curr.next = l2;
                l2=l2.next;
            }
            curr= curr.next;
        }
        if(l1==null) curr.next = l2;
        else curr.next = l1;
        return dummy.next;
    }

    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null) return head;
        Node temp = null, slow = head, fast = head;
        while(fast!=null&&fast.next!=null){
            temp = slow;
            slow =slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        Node l1 = mergeSort(head);  //first part from head to slow-1
        Node l2 = mergeSort(slow);  //slow to end
        return mergeList(l1,l2);
    }
}

