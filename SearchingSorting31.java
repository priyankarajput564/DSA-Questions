package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting31 {
    static boolean solve(int[] arr,int n,int p,int mid){
        int t = 0;
        int par = 0;
        for(int i=0;i<n;i++){
            t = arr[i];
            int j = 2;
            while(t<=mid){
                par++;
                t = t + (arr[i]*j);
                j++;
            }
            if(par>=p){
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of Prata :");
            int p = sc.nextInt();
            System.out.println("Enter number of elements in Array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of Array :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int low = 0;
            int high = 10*n*(n+1)/2;
            int ans = 0;

            while(low<=high){
                int mid = low + (high - low)/2;
                if(solve(arr,n,p,mid) == true){
                    ans = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            System.out.println("Maximum time taken for making prata :" + ans);

        }
    }
}
