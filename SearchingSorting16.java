package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of array :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Solution77 ob = new Solution77();
            long[] ans = ob.productExceptSelf(arr,n);
            System.out.println("Product array puzzle :" + Arrays.toString(ans));

        }
    }
}

class Solution77
{
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        // int count = 0;
        // long ans[] = new long[n];
        // long total = 1;
        // for(int i = 0 ; i < n ; i++) {
        //     if(nums[i] != 0 ) total *= nums[i];
        //     else count++;
        // }
        // for(int i = 0 ; i < n ; i++) {
        //     if(nums[i] == 0 && count == 1) ans[i] = total;
        //     else if(nums[i] == 0 && count > 1) ans[i] = 0;
        //     else if(nums[i] != 0 && count >= 1) ans[i] = 0;
        //     else ans[i] = total / nums[i];
        // }
        // return ans;

        //Second method
        long res[] = new long[n];
        long msi = nums[0];

        res[0] =1;
        for(int i =1 ; i<n ; i++)
        {
            res[i] = msi;
            msi= msi*nums[i];
        }

        msi= nums[n-1];
        for(int i=n-2 ; i>=0; i--)
        {
            res[i]= res[i]*msi;
            msi= msi*nums[i];
        }
        return res;
    }
}
