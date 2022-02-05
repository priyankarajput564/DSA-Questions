package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            System.out.println("Enter number of elements in array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of array :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Solution68 ob = new Solution68();
            int[] ans = ob.findTwoElement(arr,n);
            System.out.println("Reapting and missing number of array containging number from 1 to n : " + ans[0] + ", " + ans[1] );

        }
    }
}

class Solution68 {
    int[] findTwoElement(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count2=0;
        int ans=1;
        for(int i=0;i<n;i++){
            if (i+1 <n && arr[i]==arr[i+1])count2=i;
            if (arr[i]==ans)ans++;
        }
        int res[]=new int[2];
        res[0]=arr[count2];
        res[1]=ans;
        return res;
    }
}