package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting12 {
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

            Solution73 ob = new Solution73();
            System.out.println("Maximum money the thief can get : " + ob.FindMaxSum(arr,n) );

        }
    }
}

class Solution73
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        if(n==0)
            return 0;

        if(n==1)
            return arr[0];

        int dp[] = new int[n+1];

        dp[1] = arr[0];
        dp[2] = Math.max(arr[0] , arr[1]);

        for(int i=3 ; i<=n ; i++){
            dp[i] = Math.max(dp[i-1] , dp[i-2] + arr[i-1]);
        }
        return dp[n];
    }
}
