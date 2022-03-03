package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting30 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in Array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of Array :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter number of painters :");
            int k = sc.nextInt();

            Solution85 ob = new Solution85();
            System.out.println("Maximum time Painter take to do painting on board :" + ob.minTime(arr,n,k));

        }
    }
}

class Solution85{
    static long minTime(int[] arr,int n,int k){
        long low = Integer.MIN_VALUE;
        long high = 0;

        for(int i=0;i<n;i++){
            high += arr[i];
            low = Math.max(low,arr[i]);
        }

        while(low <= high){
            int mid = (int)(low+high)/2;

            if(isPossible(mid,arr,n,k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean isPossible(int mid,int[] arr,int n,int k){
        int count = 1;
        int head = 0;

        for(int i=0;i<n;i++){
            if(head+arr[i]<=mid){
                head += arr[i];
            }
            else{
                head = arr[i];
                count++;
            }
        }

        return count<=k;
    }
}


