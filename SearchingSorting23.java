package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting23 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in first array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of first array :");
            int[] arr1 = new int[n];
            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter number of elements in second array :");
            int m = sc.nextInt();
            System.out.println("Enter elements of second array :");
            int[] arr2 = new int[n];
            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }

            System.out.println("Enter value of k :");
            int k = sc.nextInt();

            Solution80 ob = new Solution80();
            System.out.println("kth element of merged array:" + ob.kthElement(arr1,arr2,n,m,k));

        }
    }
}

class Solution80 {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int[] arr = new int[n+m];
        int idx = 0;

        for(int i=0;i<n;i++){
            arr[idx] = arr1[i];
            idx++;
        }

        for(int i=0;i<m;i++){
            arr[idx] = arr2[i];
            idx++;
        }

        Arrays.sort(arr);
        return (long)arr[k-1];
    }
}