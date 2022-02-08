package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in first array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of first array in ascending order:");
            int[] arr1 = new int[n];
            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter number of elements in second array :");
            int m = sc.nextInt();
            System.out.println("Enter elements of second array in ascending order :");
            int[] arr2 = new int[m];
            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }

            Solution75 ob = new Solution75();
            ob.merge(arr1,arr2,n,m);
            System.out.println("Merging of two sorted arrays: ");
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));

        }
    }
}

class Solution75 {

    public void merge(int arr1[], int arr2[], int n, int m) {
        int i = n- 1;
        int j = 0;
        while(i>=0 && j<m){
            if(arr1[i]> arr2[j]){
                int x = arr1[i];
                arr1[i] = arr2[j];
                arr2 [j] = x;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}