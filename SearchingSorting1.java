package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            System.out.println("Enter elements of array in ascending order :");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            System.out.println("Enter target element :");
            int x = sc.nextInt();
            Solution63 ob = new Solution63();
            System.out.println("First and last index of target occurence is  : " + ob.find(arr,n,x));

        }
    }
}

class Solution63
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> list = new ArrayList<>();
        long start = (long)search(arr,x,true);
        long end = (long)search(arr,x,false);
        list.add(start);
        list.add(end);
        return list;
    }

    int search(long[] arr, int x, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(x<arr[mid]){
                end = mid - 1;
            }
            else if(x>arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}