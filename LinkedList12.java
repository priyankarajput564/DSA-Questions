package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LL12 list1 = new LL12();
        LL12 list2 = new LL12();
        System.out.println("Enter elements in list1 :");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            list1.insertLast(val);
        }
        System.out.println("Enter elements in list2 :");
        for(int i=0;i<m;i++){
            int val = sc.nextInt();
            list2.insertLast(val);
        }
        Solution89 ob= new Solution89();
        System.out.println(ob.intersectPoint(list1.head,list2.head));


    }
}

class Node3{
    int value;
    Node3 next;

    public Node3(int value){
        this.value = value;
    }

    public Node3(int value, Node3 next){
        this.value = value;
        this.next = next;
    }
}

class LL12{
    Node3 head;
    Node3 tail;
    private int size;

    public LL12(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node3 node = new Node3(val);
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
        Node3 Node3 = new Node3(val);
        tail.next = Node3;
        tail = Node3;
        size++;
    }

    public void display(){
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


}

class Solution89{
    public int intersectPoint(Node3 head1, Node3 head2)
    {
        if(head1 == null || head2 == null){
            return -1;
        }

        Node3 a = head1;
        Node3 b = head2;

        while(a != b){
            a = a == null? head2 : a.next;
            b = b == null? head1 : b.next;
        }

        return a.value;
    }
    public void printList(Node3 n){
        while(n!=null){
            System.out.print(n.value + "->");
            n = n.next;
        }
        System.out.println("End");
    }

}