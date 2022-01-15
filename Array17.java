package DSA;

import java.io.*;
import java.util.*;
import java.math.*;

public class Array17{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution12 ob = new Solution12();
            System.out.println(ob.maxProfit(arr));
        }
    }
}

class Solution12 {
    public int maxProfit(int[] prices) {
        int min = prices[0],profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            profit = Math.max(profit,prices[i] - min);
        }
        return profit;
    }
}

