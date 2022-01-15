package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Solution17 ob = new Solution17();
            System.out.println(ob.maxProduct(arr,N));
        }
    }
}

class Solution17{
    long maxProduct(int[] arr,int n){
        long max=Long.MIN_VALUE;
        long cur=1;
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                cur=cur*arr[j];
                if(cur>max)
                    max=cur;
            }
            cur=1;

        }
        return max;
    }

}