package DSA;

import java.io.*;
import java.util.*;

public class Array27 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            long m = sc.nextInt();
            long[] arr1 = new long[(int)n];
            long[] arr2 = new long[(int)m];

            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }
            Solution20 ob = new Solution20();
            System.out.println(ob.isSubset(arr1,arr2,n,m));
        }
    }
}

class Solution20 {
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(a1[i]);
        }
        String s = "Yes";
        for(int i=0;i<m;i++){
            if(list.contains(a2[i])){
                continue;
            }
            else{
                s = "No";
            }
        }
        return s;
    }
}
