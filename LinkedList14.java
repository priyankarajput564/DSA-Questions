package DSA;

import javax.xml.soap.Node;
import java.util.*;
import java.lang.*;
import java.io.*;

//Very Important question
public class LinkedList14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL14 list = new LL14();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertLast(6);
        list.display();

        list.head = list.quickSort(list.head);
        list.display();
    }
}

class LL14{
    Node head;
    Node tail;
    private int size;

    public LL14(){
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

    public Node quickSort(Node node) {
        Node last = node;
        Node first = node;
        while (last.next != null) {
            last = last.next;
        }

        Node h = quickS(first, last);
        return h;
    }

    public Node partition(Node first, Node last) {

        Node front = first;
        Node pivot = first;
        int temp = 0;

        while (front != null && front != last) {
            if (front.value < last.value) {
                pivot = first;
                temp = first.value;
                first.value = front.value;
                front.value = temp;
                first = first.next;
            }
            front = front.next;
        }

        temp = first.value;
        first.value = last.value;
        last.value = temp;

        return pivot;
    }

    public Node quickS(Node first, Node last) {

        if (first == last) {
            return first;
        }
        Node pivot = partition(first, last);

        if (pivot != null && pivot.next != null) {
            quickS(pivot.next, last);
        }
        if (pivot != null && first != pivot) {
            quickS(first, pivot);
        }
        return first;
    }
}

