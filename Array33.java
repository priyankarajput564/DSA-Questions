package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution25 ob = new Solution25();
            System.out.println(ob.minSwap(arr,n,k));
        }
    }
}

class Solution25{

    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int good=0;
        int bad=0;
//good value is the one which is <= k
        for(int i=0;i<n;i++){
            if(arr[i]<=k) good++;
        }
//bad > k
        for(int j=0;j<good;j++){
            if(arr[j]>k) bad++;
        }
        //sliding window with start and end pointer of the window
        //size of window = umber of good values
        int start=0;
        int end=good;
        int ans=bad;
        while(end<n){
            if(arr[start]>k) bad--; //if start element was bad and we move the window, then badValue count wil decrease
            if(arr[end]>k) bad++;

            ans=Math.min(ans,bad); //subarray containing min badvalues is the min swap required
            start++;
            end++;
        }
        return ans;
    }
}
