package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of array :");
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            System.out.println("Enter any number :");
            int k = sc.nextInt();

            Solution74 ob = new Solution74();
            System.out.println("Sum of triplet of array have sum less then given number: " + ob.countTriplets(arr,n,k) );

        }
    }
}

class Solution74
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long count=0;
        for(int j=1;j<arr.length-1;j++){
            int i=0;
            int k=n-1;
            while(i<j &&k>j){
                if(arr[i]+arr[j]+arr[k]<sum){
                    count+=(k-j);
                    i++;
                }
                else
                    k--;
            }
        }
        return(count);
    }
}
