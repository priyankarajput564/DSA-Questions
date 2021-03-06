package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array  :");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution64 ob = new Solution64();
            System.out.println("Elements of array equal to its corresponding index start with 1 : " + ob.valueEqualToIndex(arr,n));
        }
    }
}

class Solution64 {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(arr[i-1] == i){
                list.add(i);
            }
        }
        return list;
    }
}