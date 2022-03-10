package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedList10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LL10 list1 = new LL10();
        LL10 list2 = new LL10();
        System.out.println("Enter elements in list1 :");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            list1.insertFirst(val);
        }
        System.out.println("Enter elements in list2 :");
        for(int i=0;i<m;i++){
            int val = sc.nextInt();
            list2.insertFirst(val);
        }
        Solution87 ob= new Solution87();
        Node1 res = ob.addTwoLists(list1.head,list2.head);
        ob.printList(res);


    }
}

class Node1{
    int value;
    Node1 next;

    public Node1(){
    }

    public Node1(int value){
        this.value = value;
    }

    public Node1(int value, Node1 next){
        this.value = value;
        this.next = next;
    }
}

class LL10{
    Node1 head;
    Node1 tail;
    private int size;

    public LL10(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node1 Node1 = new Node1(val);
        Node1.next = head;
        head = Node1;

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
        Node1 Node1 = new Node1(val);
        tail.next = Node1;
        tail = Node1;
        size++;
    }

    public void display(){
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


}

class Solution87{
    public Node1 addTwoLists(Node1 l1,Node1 l2){
        // code here
        // return head of sum list
        Node1 dumy = new Node1();
        Node1 temp = dumy;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.value;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.value;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            Node1 node = new Node1(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return dumy.next;
    }
    public void printList(Node1 n){
        while(n!=null){
            System.out.print(n.value + "->");
            n = n.next;
        }
        System.out.println("End");
    }

}