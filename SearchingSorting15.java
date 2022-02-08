package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting15 {
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

            Solution76 ob = new Solution76();
            System.out.println("Count of subarray having sum equal to 0 : " + ob.findSubarray(arr,n));

        }
    }
}

class Solution76{
    //Function to count subarrays with sum equal to 0.
    public long findSubarray(long[] arr ,int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0, count = 0;
        map.put(0,1);

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }
            else{
                map.put(sum,1);
            }

        }

        return count;
    }
}
