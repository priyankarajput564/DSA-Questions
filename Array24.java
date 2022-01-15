package DSA;

import java.io.*;
import java.util.*;

public class Array24 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution18 ob = new Solution18();
            System.out.println(ob.LCoSequence(arr,n));
        }
    }
}

class Solution18
{
    //Function to return length of longest subsequence of consecutive integers.
    static int LCoSequence(int arr[], int N)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int count = 0;
        int max = 0;
        for(int i=0;i<N-1;i++){
            if(arr[i] == arr[i+1] -1){
                count++;
                max = Math.max(count,max);
            }
            else if (arr[i] == arr[i+1]){
                continue;
            }
            else{
                count = 0;
            }
        }

        return max+1;
    }
}