package DSA;

import java.io.*;
import java.util.*;

public class Array29 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Solution22 ob = new Solution22();
            System.out.println(ob.trappingWater(arr,n));
        }
    }
}

class Solution22{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        int[] ml = new int[n];
        int[] mr = new int[n];

        ml[0] = arr[0];
        for(int i =1;i<n;i++){
            ml[i] = Math.max(arr[i], ml[i-1]);
        }

        mr[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            mr[i] = Math.max(arr[i], mr[i+1]);
        }

        int[] water = new int[n];
        long sum = 0;
        for(int i = 0;i<n;i++){
            water[i] = Math.min(ml[i], mr[i]) - arr[i];
            sum += water[i];

        }
        return sum;
    }
}

