package DSA;

import java.io.*;
import java.util.*;

public class Array10VIMP{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution5 ob = new Solution5();
            System.out.println(ob.minJumps(arr));
        }
    }
}

class Solution5{
    static int minJumps(int[] arr){
        if(arr[0]==0)
            return -1;

        int step=arr[0];
        int maxReach=step;
        int count=1;
        int n=arr.length;

        for (int i=1;i<n;i++)
        {
            if(i>=n-1)
                return count;

            maxReach=Math.max(maxReach,i+arr[i]);
            step--;

            if(step==0)
            {
                count++;
                if(i>=maxReach)
                    return -1;
                step=maxReach-i;
            }
        }
        return count;
    }
}