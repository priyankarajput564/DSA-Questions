package DSA;

import java.io.*;
import java.util.*;

public class Array15IMP{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution10 ob = new Solution10();
            ob.nextPermutation(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

class Solution10 {
    public void nextPermutation(int[] A) {
        if(A == null || A.length <= 1){
            return;
        }
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]){     // Find 1st id i that breaks descending order
            i--;
        }
        if(i >= 0) {                           // If not entirely descending
            int j = A.length - 1;              // Start from the end
            while(A[j] <= A[i]){               // Find rightmost first larger id j
                j--;
            }
            swap(A, i, j);                     // Switch i and j
        }
        reverse(A, i + 1, A.length - 1);       // Reverse the descending sequence
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] A, int i, int j) {
        while(i < j){
            swap(A, i++, j--);
        }
    }
}