package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LL11 list1 = new LL11();
        LL11 list2 = new LL11();
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
        Solution88 ob= new Solution88();
        Node2 res = ob.findIntersection(list1.head,list2.head);
        ob.printList(res);


    }
}

class Node2{
    int value;
    Node2 next;

    public Node2(int value){
        this.value = value;
    }

    public Node2(int value, Node2 next){
        this.value = value;
        this.next = next;
    }
}

class LL11{
    Node2 head;
    Node2 tail;
    private int size;

    public LL11(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node2 node = new Node2(val);
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
        Node2 Node2 = new Node2(val);
        tail.next = Node2;
        tail = Node2;
        size++;
    }

    public void display(){
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


}

class Solution88{
    public Node2 findIntersection(Node2 head1, Node2 head2)
    {
        // code here.
        Node2 ans = new Node2(0);
        Node2 res = ans;
        Node2 p = head1;
        Node2 q = head2;
        while(p!=null && q != null){
            if(p.value == q.value){
                res.next = new Node2(p.value);
                res = res.next;
                p = p.next;
                q = q.next;
            }
            else if(p.value < q.value){
                p= p.next;
            }
            else{
                q = q.next;
            }
        }
        return ans.next;
    }
    public void printList(Node2 n){
        while(n!=null){
            System.out.print(n.value + "->");
            n = n.next;
        }
        System.out.println("End");
    }

}