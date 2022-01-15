package DSA;

import java.io.*;
import java.util.*;

public class Array9VIMP{
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
            Solution4 ob = new Solution4();
            System.out.println(ob.getMinDiff(arr,n,k));
        }
    }
}

class Solution4 {
    int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);
        int ans =  arr[n-1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        int mi,ma;
        for(int i=0;i<n-1;i++){
            mi = Math.min(smallest,arr[i+1] - k);
            ma = Math.max(largest,arr[i] + k);

            if(mi<0){
                continue;
            }
            else{
                ans = Math.min(ans,ma-mi);
            }
        }
        return ans;
    }
}
