package DSA;

import java.io.*;
import java.util.*;
import java.math.*;

public class Array18IMP{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution13 ob = new Solution13();
            System.out.println(ob.getPairsCount(arr,n,k));
        }
    }
}

class Solution13 {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int x : arr) {
            if(x >= k) continue;

            if (map.containsKey(k - x)) {
                count += map.get(k-x);
            }
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        return count;
    }
}
