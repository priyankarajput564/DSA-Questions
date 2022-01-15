package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int N = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Solution23 ob = new Solution23();
            System.out.println(ob.findMinDiff(arr,N,m));
        }
    }
}

class Solution23
{
    public long findMinDiff (int[] arr, long n, long m)
    {
        Arrays.sort(arr);
        int j=(int)(m-1);
        long min=Integer.MAX_VALUE;
        for(int i=0 ;i<=arr.length-m;i++)
        {
            long l= (arr[j]-arr[i]);
            if(min > l )
                min = l;

            j++;
        }
        return min;
    }
}