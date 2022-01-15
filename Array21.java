package DSA;

import java.io.*;
import java.util.*;
import java.math.*;

public class Array21{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution15 ob = new Solution15();
            System.out.println(ob.findsum(arr,n)?"Yes":"No");
        }
    }
}

class Solution15{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(set.contains(sum) || sum==0){
                return true;
            }
            else{
                set.add(sum);
            }
        }
        return false;
    }
}