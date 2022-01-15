package DSA;

import java.io.*;
import java.util.*;

public class Array13VVIMP{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution8 ob = new Solution8();
            System.out.println(ob.maxSubarraySum(arr,n));
        }
    }
}


class Solution8{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long sum = 0,maxsum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum = sum+arr[i];
            if(maxsum<sum){
                maxsum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }

        return maxsum;
    }

}