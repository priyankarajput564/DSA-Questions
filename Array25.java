package DSA;

import java.io.*;
import java.util.*;

public class Array25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution19 ob = new Solution19();
            System.out.println(ob.countOccurence(arr,n,k));
        }
    }
}

class Solution19
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int count =0;
        for(Integer value : map.values()){
            if(value > n/k){
                count++;
            }
        }
        return count;
    }
}
