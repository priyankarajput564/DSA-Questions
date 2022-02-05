package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of array :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter element to search in array :");
            int x = sc.nextInt();
            System.out.println("Enter difference between each elements of array :");
            int k = sc.nextInt();

            Solution70 ob = new Solution70();
            System.out.println("Index of first occurence of element in array : " + ob.search(arr,n,x,k) );

        }
    }
}

class Solution70{
    //Searching in an array where adjacent differ by at most k
    public static int search (int arr[], int n, int x, int k) {
        int i=0;
        while(i<n){
            if(arr[i] == x){
                return i;
            }
            i = i + Math.max(1,(x-arr[i])/k);
        }
        return -1;
    }
}

